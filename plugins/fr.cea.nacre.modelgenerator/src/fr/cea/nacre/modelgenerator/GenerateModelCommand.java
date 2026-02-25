package fr.cea.nacre.modelgenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Allocate;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREModelHelper;
import fr.cea.nacre.types.advices.command.SetValueCommunicationMediaCommand;
import fr.cea.nacre.ui.plus.command.CreateLineCommand;
import nacre.Bus;
import nacre.CRA;
import nacre.CentralController;
import nacre.Connect;
import nacre.Control;
import nacre.INACREStereotype;
import nacre.IstUnitKind;
import nacre.Link;
import nacre.LocalController;
import nacre.MainGrid;
import nacre.RTE_Installation;
import nacre.Substation;
import nacre.ZonalController;
import nacre.Zone;


/**
 * this command is used to create a variation group
 *
 */
public class GenerateModelCommand extends RecordingCommand {
	//this constant have been duplicated to avoid a circle dependencies
	public static final String NACRE_PREFERENCE_ID="fr.cea.nacre.ui.plus.preferences";
	public static final String COMMUNICATION_LATENCY_PREFERENCE ="fr.cea.nacre.ui.plus.definedefaultvalues.communicationlatency";
	public static final String COMMUNICATION_CAPACITY__PREFERENCE =	"fr.cea.nacre.ui.plus.definedefaultvalues.communicationcapacity";

	protected EObject owner;
	protected TransactionalEditingDomain domain;
	protected int nbZone=1;
	protected int nbStationPerZone=1;
	protected int nbBusPerStation=1;
	protected int nbRTEinstallationPerBus=1;
	protected int nbComMedia=1;
	private ArrayList<Port> tmpRTEInstallation;
	private Random rand;
	Package controllers=null;
	private Package cfapackage;
	private Package cfra;
	private Package cra;
	Stereotype  SwSchedulableResourceStereotype;
	Stereotype  ResourceUsageSterotype;
	private Package SoftwareResourcesPackage;
	private Package computingResourcePackage;
	private Package communicationMediaPackage;
	private Stereotype ComputingResourceStereotype;
	private Class DataCenterClass;
	private Stereotype communicationMedia;
	private Class INUITCOEUR;
	private ArrayList<Class> boucle;

	/**
	 * use to create a constraint stereotyped  variation group
	 * @param domain the domain to execute a transaction
	 * @param variant the use case
	 * @param architectureElement
	 */
	public GenerateModelCommand(TransactionalEditingDomain domain, EObject owner){
		super(domain,"createBinding");
		this.owner = owner;
		this.domain = domain;
		this.rand= new Random();

	}

	@Override
	protected void doExecute() {
		////(10+(4+(2+13*nbRTEinstallationPerBus)*nbBusPerSubstation)*nbStationPerZone))*nbZone
		this.display("Idea about number of element: (10+(4+(2+13*nbRTEinstallationPerBus)*nbBusPerSubstation)*nbStationPerZone))*nbZone");
		int nbelement=0;
		if(owner instanceof Element) {
			String zoneNumberText=this.getStringFromUser("Number of Zones");
			this.nbZone=Integer.parseInt(zoneNumberText);
			String substationNumberText=this.getStringFromUser("Number of Substations per Zone");
			this.nbStationPerZone=Integer.parseInt(substationNumberText);
			String busNumberText=this.getStringFromUser("Number of bus per substation");
			this.nbBusPerStation=Integer.parseInt(busNumberText);
			String rteNumberText=this.getStringFromUser("Number of RTE installations per bus");
			this.nbRTEinstallationPerBus=Integer.parseInt(rteNumberText);
			String comNumberText=this.getStringFromUser("Number of communication Medias linked to INUIT COEUR");
			this.nbComMedia=Integer.parseInt(comNumberText);
			System.out.println("Model generator");
			Model root = ((Element)owner).getModel();
			NACREModelHelper helper = new NACREModelHelper();
			Package cFAPackage = helper.getorCreateCFA(root);
			this.controllers = helper.getorCreateControllers(cFAPackage);

			MainGrid mainGrid=helper.getMainGrid((Element)owner);
			this.cfapackage=helper.getCFA(((Element)owner).getModel());
			Package cfras=helper.getCFRAS(((Element)owner).getModel());
			this.cfra=helper.getCFRA(cfras).get(0);
			Package cras=helper.getCRAS(((Element)owner).getModel());
			this.cra=helper.getCRA(cras).get(0);
			this.SwSchedulableResourceStereotype=mainGrid.getBase_Class().getApplicableStereotype("MARTE::MARTE_DesignModel::SRM::SW_Concurrency::SwSchedulableResource");
			this.ResourceUsageSterotype=mainGrid.getBase_Class().getApplicableStereotype("MARTE::MARTE_Foundations::GRM::ResourceUsage");
			this.ComputingResourceStereotype = mainGrid.getBase_Class().getApplicableStereotype("MARTE::MARTE_Foundations::GRM::ComputingResource");
			this.communicationMedia = mainGrid.getBase_Class().getApplicableStereotype("MARTE::MARTE_Foundations::GRM::CommunicationMedia");

			this.SoftwareResourcesPackage =helper.getSoftwareResources(cra);
			this.computingResourcePackage =helper.getComputingResources(cra);
			this.communicationMediaPackage=helper.getCommunicationMedias(cra);

			Class centralController=(Class)this.controllers.getMember("CentralController");
			Class srCentralController=(Class)this.SoftwareResourcesPackage.getMember("SR_CentralController");
			SwSchedulableResource swr_ster = UMLUtil.getStereotypeApplication(srCentralController, SwSchedulableResource.class);
			swr_ster.setType("periodic(period=10, jitter=0)");

			//create 1 element
				
			//create DataCenter
			System.out.println("Create DataCenter");
			//create 1 element
			this.DataCenterClass=this.computingResourcePackage.createOwnedClass("DataCenter", false);
			//create 1 element
			this.DataCenterClass.applyStereotype(ComputingResourceStereotype);
			Abstraction allocateSR=UMLFactory.eINSTANCE.createAbstraction();
			allocateSR.getClients().add(srCentralController);
			allocateSR.getSuppliers().add(DataCenterClass);
			allocateSR.setName(DataCenterClass.getName());
			this.SoftwareResourcesPackage.getPackagedElements().add(allocateSR);		
			Stereotype allocationstereo=allocateSR.getApplicableStereotype("MARTE::MARTE_Foundations::Alloc::Allocate");
			allocateSR.applyStereotype(allocationstereo);
			
			System.out.println("Create INUIT_Coeur");
			this.INUITCOEUR=this.communicationMediaPackage.createOwnedClass("Reseau_INUIT_Coeur", false);
			this.INUITCOEUR.applyStereotype(communicationMedia);
			Abstraction abstractionCR=UMLFactory.eINSTANCE.createAbstraction();
			abstractionCR.getClients().add(DataCenterClass);
			abstractionCR.getSuppliers().add(INUITCOEUR);
			abstractionCR.setName("Connect_"+DataCenterClass.getName()+"_to_"+INUITCOEUR.getName());
			this.communicationMediaPackage.getPackagedElements().add(abstractionCR);
			//create 1 element
			Stereotype connectstereo=abstractionCR.getApplicableStereotype(INACREStereotype.CONNECT_STEREOTYPE);
			abstractionCR.applyStereotype(connectstereo);


			generateBoucle();

			
			//CreatZone
			int indexZone=0;
			while (indexZone<nbZone) {
				//10+(4+(2+13*nbRTEinstallationPerBus)*nbBusPerSubstation)*nbStationPerZone)
				createZone(controllers, mainGrid, indexZone);
				indexZone++;
			}
			
			CreateLineCommand createlineCommand= new CreateLineCommand(domain, owner);
			createlineCommand.execute();
			Iterator<EObject> iteratorModel=root.eResource().getAllContents();
			while (iteratorModel.hasNext()) {
				EObject eObject = (EObject) iteratorModel.next();
				nbelement++;

			}
			this.display("This model contains "+nbelement);

		}
	}
	private void generateBoucle() {
		System.out.println("Create CommunicationMedias");	
		this.boucle=new ArrayList<Class>();
		for(int i=0;i<this.nbComMedia;i++) {
			String name=generateWord(5);
			Class tmpCommMedia=this.communicationMediaPackage.createOwnedClass("Boucle_"+name, false);
			tmpCommMedia.applyStereotype(communicationMedia);
			ScopedPreferenceStore scopedPreferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,NACRE_PREFERENCE_ID);
			String latency = scopedPreferenceStore.getString(COMMUNICATION_LATENCY_PREFERENCE);
			String capacity = scopedPreferenceStore.getString(COMMUNICATION_CAPACITY__PREFERENCE);
			CommunicationMedia comM= UMLUtil.getStereotypeApplication(tmpCommMedia, CommunicationMedia.class);
			comM.getCapacity().add(capacity);
			comM.getBlockT().add(latency);
			boucle.add(tmpCommMedia);
			//create 1 element
			Abstraction abstractionCR=UMLFactory.eINSTANCE.createAbstraction();
			abstractionCR.getClients().add(tmpCommMedia);
			abstractionCR.getSuppliers().add(INUITCOEUR);
			abstractionCR.setName("Link"+DataCenterClass.getName()+"_to_"+INUITCOEUR.getName());
			this.communicationMediaPackage.getPackagedElements().add(abstractionCR);
			Stereotype linkstereo=abstractionCR.getApplicableStereotype(INACREStereotype.LINK_STEREOTYPE);
			abstractionCR.applyStereotype(linkstereo);
		}
	}

	public static String generateWord(int length) {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		StringBuilder word = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(letters.length());
			word.append(letters.charAt(index));
		}

		return word.toString();
	}
	private void RTEinstallationCreationPerZone() {
		this.tmpRTEInstallation=new ArrayList<Port>();
		String lineName= generateWord(6);
		for(int index=0;index<this.nbStationPerZone*this.nbRTEinstallationPerBus*this.nbBusPerStation; index++) {

			Port currentPort= UMLFactory.eINSTANCE.createPort();
			currentPort.setName("RTE_"+index);
			if( (index % 2)==0) {
				currentPort.setName(lineName+ "_2");
			}
			else{
				lineName= generateWord(6);
				currentPort.setName(lineName+"_1");

			}
			this.tmpRTEInstallation.add(currentPort);
		}


	}
	private void createZone(Package controllers, MainGrid mainGrid, int indexZone) {
		System.out.println("Create Zone");
		//10+(4+(2+13*nbRTEinstallationPerBus)*nbBusPerSubstation)*nbStationPerZone)
		RTEinstallationCreationPerZone();
		String zoneName=generateWord(4);
		//create 1 element
		org.eclipse.uml2.uml.Class aZone=(org.eclipse.uml2.uml.Class)mainGrid.getBase_Class().createNestedClassifier(zoneName, UMLPackage.eINSTANCE.getClass_());
		Stereotype ZoneStereotype = aZone.getApplicableStereotype(INACREStereotype.ZONE_STEREOTYPE);
		//create 1 element
		aZone.applyStereotype(ZoneStereotype);
		Zone appliedZoneStereotype=UMLUtil.getStereotypeApplication(aZone, Zone.class);
		mainGrid.getZone().add(appliedZoneStereotype);
		//create 1 element
		org.eclipse.uml2.uml.Class controllerClass=controllers.createOwnedClass(zoneName+"Controller", true);
		Stereotype ZonalControllerStereotype = controllerClass.getApplicableStereotype(INACREStereotype.ZONALCONTROLLER_STEREOTYPE);
		//create 1 element
		controllerClass.applyStereotype(ZonalControllerStereotype);
		ZonalController appliedZonalControllerStereotype=UMLUtil.getStereotypeApplication(controllerClass, ZonalController.class);
		appliedZonalControllerStereotype.setZone(appliedZoneStereotype);


		//create softwareResource				
		//create 1 element
		Class SRclass=this.SoftwareResourcesPackage.createOwnedClass("SR_tie_"+controllerClass.getName(), true);
		//create 1 element
		SRclass.applyStereotype(this.ResourceUsageSterotype);
		//create 1 element
		SRclass.applyStereotype(this.SwSchedulableResourceStereotype);
		SwSchedulableResource swr_ster = UMLUtil.getStereotypeApplication(SRclass, SwSchedulableResource.class);
		swr_ster.setType("periodic(period=10, jitter=0)");

		//create abstraction for software Resource to Controler
		//create 1 element
		Abstraction abstaction=UMLFactory.eINSTANCE.createAbstraction();
		abstaction.getClients().add(SRclass);
		abstaction.getSuppliers().add(controllerClass);
		abstaction.setName(controllerClass.getName());
		this.cfra.getPackagedElements().add(abstaction);

		//create allocate links form SR to ComputingResource
		//create 1 element
		Abstraction abstractionCR=UMLFactory.eINSTANCE.createAbstraction();
		abstractionCR.getClients().add(SRclass);
		abstractionCR.getSuppliers().add(DataCenterClass);
		abstractionCR.setName(DataCenterClass.getName());
		this.SoftwareResourcesPackage.getPackagedElements().add(abstractionCR);
		//create 1 element
		Stereotype allocationstereo=abstractionCR.getApplicableStereotype("MARTE::MARTE_Foundations::Alloc::Allocate");
		abstractionCR.applyStereotype(allocationstereo);

		int indexstation=0;
		while (indexstation<nbStationPerZone) {
			//4+(2+13*nbRTEinstallationPerBus)*nbBusPerSubstation
			indexstation = createsubStation(aZone, appliedZoneStereotype, indexstation);
		}
	}

	private int createsubStation(org.eclipse.uml2.uml.Class aZone, Zone appliedZoneStereotype, int indexstation) {
		System.out.println("Create Substations");
		//4+(2+13 elements *nbRTEinstallationPerBus)*nbBusPerSubstation
		String substationName=generateWord(7);
		//create 1 element
		org.eclipse.uml2.uml.Class aStation=(org.eclipse.uml2.uml.Class)aZone.createNestedClassifier(substationName, UMLPackage.eINSTANCE.getClass_());
		Stereotype SubStationStereotype = aStation.getApplicableStereotype(INACREStereotype.SUBSTATION_STEREOTYPE);
		//create 1 element
		aStation.applyStereotype(SubStationStereotype);
		Substation appliedsubStationStereotype=UMLUtil.getStereotypeApplication(aStation, Substation.class);
		appliedZoneStereotype.getSubstation().add(appliedsubStationStereotype);

		//create Computing Resource
		//create 1 element
		Class computingResourceClass=this.computingResourcePackage.createOwnedClass("CR_"+substationName, false);
		//create 1 element
		computingResourceClass.applyStereotype(ComputingResourceStereotype);
		ComputingResource appliedCRStereotype=UMLUtil.getStereotypeApplication(computingResourceClass, ComputingResource.class);

		//connect CR to CommMedia
		int indexComMedia = rand.nextInt(this.boucle.size());
		//create 1 element
		Class currentBoucle = this.boucle.get(indexComMedia);
		Abstraction abstractionBoucle=UMLFactory.eINSTANCE.createAbstraction();
		abstractionBoucle.getClients().add(appliedCRStereotype.getBase_Classifier());
		abstractionBoucle.getSuppliers().add(currentBoucle);
		abstractionBoucle.setName("Connect_"+appliedCRStereotype.getBase_Classifier().getName()+"_to_"+currentBoucle.getName());
		this.communicationMediaPackage.getPackagedElements().add(abstractionBoucle);
		//create 1 element
		Stereotype connectstereo=abstractionBoucle.getApplicableStereotype(INACREStereotype.CONNECT_STEREOTYPE);
		abstractionBoucle.applyStereotype(connectstereo);

		int indexbus=0;
		while (indexbus<this.nbBusPerStation) {
			//2+13 elements *nbRTEinstallationPerBus
			createBus(indexbus, aStation, appliedsubStationStereotype,appliedCRStereotype);
			indexbus++;
		}		
		indexstation++;
		return indexstation;
	}

	private void createBus(int indexbus, org.eclipse.uml2.uml.Class aStation,
			Substation appliedsubStationStereotype,ComputingResource appliedCRStereotype) {
		//2+13 elements *nbRTEinstallationPerBus
		//create 1 element
		System.out.println("Create Bus");
		org.eclipse.uml2.uml.Class aBus=(org.eclipse.uml2.uml.Class)aStation.createNestedClassifier(aStation.getName()+indexbus, UMLPackage.eINSTANCE.getClass_());
		Stereotype BusStereotype = aBus.getApplicableStereotype(INACREStereotype.BUS_STEREOTYPE);
		//create 1 element
		aBus.applyStereotype(BusStereotype);
		Bus appliedBusStereotype=UMLUtil.getStereotypeApplication(aBus, Bus.class);
		appliedsubStationStereotype.getBus().add(appliedBusStereotype);
		for(int i=0; i<this.nbRTEinstallationPerBus;i++) {
			//13 elements *nbRTEinstallationPerBus
			attacheRTEInstallation(aBus, appliedBusStereotype, appliedCRStereotype);
		}
	}

	private void attacheRTEInstallation(org.eclipse.uml2.uml.Class aBus,Bus appliedBusSterotype,ComputingResource appliedCRStereotype) {
		//create 13 elements /RTE
		int index = rand.nextInt(this.tmpRTEInstallation.size());
		//create 1 element
		Port currentRTE = this.tmpRTEInstallation.remove(index);
		aBus.getOwnedPorts().add(currentRTE);
		Stereotype rteStereotype = currentRTE.getApplicableStereotype(INACREStereotype.RTE_INSTALLATION_STEREOTYPE);
		//create 1 element
		currentRTE.applyStereotype(rteStereotype);
		RTE_Installation appliedRTEStereotype=UMLUtil.getStereotypeApplication(currentRTE, RTE_Installation.class);
		appliedRTEStereotype.setBranch(currentRTE.getName().substring(0, currentRTE.getName().length()-2));
		appliedRTEStereotype.setSide(Integer.parseInt(currentRTE.getName().substring(currentRTE.getName().length()-1, currentRTE.getName().length())));
		//create 1 element
		nacre.NFP_IST nfp_ist = nacre.NacreFactory.eINSTANCE.createNFP_IST();
		nfp_ist.setUnit(IstUnitKind.get("A"));
		nfp_ist.setPrecision(689.00);
		appliedRTEStereotype.setIst(nfp_ist);
		appliedBusSterotype.getEquipement().add(appliedRTEStereotype);
		//create 1 element
		org.eclipse.uml2.uml.Class controllerClass=controllers.createOwnedClass("LC_"+currentRTE.getName(), true);
		Stereotype localControllerStereotype = controllerClass.getApplicableStereotype(INACREStereotype.LOCALCONTROLLER_STEREOTYPE);
		//create 1 element
		controllerClass.applyStereotype(localControllerStereotype);
		LocalController appliedlocalControllerStereotype=UMLUtil.getStereotypeApplication(controllerClass, LocalController.class);
		appliedlocalControllerStereotype.setEquipement(appliedRTEStereotype);
		//create softwareResource				
		//create 1 element
		Class SRclass=this.SoftwareResourcesPackage.createOwnedClass("SR_tie_"+currentRTE.getName(), true);
		//create 1 element
		SRclass.applyStereotype(this.ResourceUsageSterotype);
		//create 1 element
		SRclass.applyStereotype(this.SwSchedulableResourceStereotype);
		SwSchedulableResource swr_ster = UMLUtil.getStereotypeApplication(SRclass, SwSchedulableResource.class);
		swr_ster.setType("periodic(period=10, jitter=0)");

		//create abstraction for software Resource to Controler
		//create 1 element
		Abstraction abstaction=UMLFactory.eINSTANCE.createAbstraction();
		abstaction.getClients().add(SRclass);
		abstaction.getSuppliers().add(controllerClass);
		abstaction.setName(controllerClass.getName());
		this.cfra.getPackagedElements().add(abstaction);

		//create allocate links form SR to ComputingResource
		//create 1 element
		Abstraction abstractionCR=UMLFactory.eINSTANCE.createAbstraction();
		abstractionCR.getClients().add(SRclass);
		abstractionCR.getSuppliers().add(appliedCRStereotype.getBase_Classifier());
		abstractionCR.setName(appliedCRStereotype.getBase_Classifier().getName());
		this.SoftwareResourcesPackage.getPackagedElements().add(abstractionCR);
		//create 1 element
		Stereotype allocationstereo=abstractionCR.getApplicableStereotype("MARTE::MARTE_Foundations::Alloc::Allocate");
		abstractionCR.applyStereotype(allocationstereo);


	}

	private void display(String messsage) {


		// Afficher la popup avec JFace
		MessageDialog.openInformation(new Shell(), "Information", messsage);
	}
	private String getStringFromUser(String message) {
		String valueString="";
		IInputValidator inputValidator= new IInputValidator() {
			public String isValid(String newText) {
				return (newText == null || newText.trim().length() == 0) ? " " : null; //$NON-NLS-1$
			}
		};

		InputDialog dialog= new InputDialog(new Shell(), "NACRE", message,"", inputValidator);

		if (dialog.open() == Window.OK) {
			valueString=dialog.getValue();
		}
		return valueString;
	}
}