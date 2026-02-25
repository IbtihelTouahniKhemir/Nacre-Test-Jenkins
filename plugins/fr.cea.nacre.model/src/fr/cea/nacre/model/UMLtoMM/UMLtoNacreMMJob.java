package fr.cea.nacre.model.UMLtoMM;



import org.eclipse.emf.ecore.EObject;
//import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;

import fr.cea.nacre.model.NACREModelHelper;
import fr.cea.nacre.model.NACREMM.study.Study;
import fr.cea.nacre.model.NACREMM.study.StudyFactory;
import fr.cea.nacre.model.factory.GCMFactory2;

/** the purpose of this class is to transform a instance of NACRE UML model to an instance NACRE MM job
 *  in order to be able to generate in JSON for example.
 **/
public class UMLtoNacreMMJob implements IUMLtoNACRE{
	//rules:
	// all target elements of are prefixed by the metamodel by "gcm_"
	// all UML native element are prefixed by "UML
	// all stereotype application are prefixed by "StereotypeApp"

	//UML elements
	private Class UML_mainGrid ;

	//NACRE MM elements
	private Study gcm_Study;

	public GCMFactory2 gcmFactory ;
	private NACREModelHelper nacreModelHelper=null;

	public void setMainGridClass(Class maingridclass) {
		//verify if this class is a maingrid class...
		this.UML_mainGrid = maingridclass;
	}
	public UMLtoNacreMMJob(String studyName, Class UML_maingrid) {
		super();
		gcmFactory = new GCMFactory2();
		setMainGridClass(UML_maingrid);
		setStudy(studyName);
		nacreModelHelper= new NACREModelHelper();

	}
	@Override
	public EObject construct() {
		//1. create CFA structure
		createCFAStructure();
		//2. create CRA structure
		createCRAStructure();
		//3. create CFRAStructure
		createCFRAStructure();
		//4. create HAZARD structure
		createHAZARDStructure();
		return gcm_Study;
	}


	private void createHAZARDStructure() {
		Package UML_craPackage =nacreModelHelper.getCRAS(UML_mainGrid.getModel());
		Package UML_cfaPackage =nacreModelHelper.getCFA(UML_mainGrid.getModel());
		IUMLtoNACRE umLtoCRAMMjob= new UMLtoHAZARDSLMMJob(UML_craPackage, UML_cfaPackage, UML_mainGrid, gcmFactory, gcm_Study);
		umLtoCRAMMjob.construct();

	}
	private void createCFRAStructure() {
		Package UML_cfrasPackage = nacreModelHelper.getCFRAS(UML_mainGrid.getModel());
		IUMLtoNACRE umLtoCRAMMjob= new UMLtoCFRAMMjob(UML_cfrasPackage, gcm_Study);
		umLtoCRAMMjob.construct();

	}
	private void setStudy(String studyName) {
		this.gcm_Study= StudyFactory.eINSTANCE.createStudy();
		gcm_Study.setName(studyName);
		gcm_Study.setQualifiedName(studyName);
	}

	public Study getStudy(){
		return this.gcm_Study;
	}
	public Class getMainGrid_class() {
		return UML_mainGrid;
	}

	/** create CFA structure from the UML model
	 *
	 */
	private void createCFAStructure() {
		Package UML_cfa_package=nacreModelHelper.getCFA(UML_mainGrid.getModel());
		IUMLtoNACRE umLtoCFAMMjob = new UMLtoCFAMMjob(UML_cfa_package, UML_mainGrid, gcmFactory, gcm_Study);
		umLtoCFAMMjob.construct();
	}

	private void createCRAStructure() {
		Package UML_craPackage =nacreModelHelper.getCRAS(UML_mainGrid.getModel());
		IUMLtoNACRE umLtoCRAMMjob= new UMLtoCRAMMjob(UML_craPackage, gcmFactory, gcm_Study);
		umLtoCRAMMjob.construct();
	}



//	private List<CommunicationMedia> getCommMedias(List<Element> list) {
//
//		List<CommunicationMedia> commMedias = new ArrayList<CommunicationMedia>();
//		for (Element classe : list) {
//			if (classe.getAppliedStereotype("MARTE::MARTE_Foundations::GRM::CommunicationMedia") != null) {
//				CommunicationMedia steroetype = UMLUtil.getStereotypeApplication(classe,
//						CommunicationMedia.class);
//				commMedias.add(steroetype);
//			}
//		}
//		return commMedias;
//	}
//
//	private Integer getNetworkLatency(CommunicationMedia communicationMedia) {
//		Integer latency = 0;
//
//		if (communicationMedia != null && communicationMedia.getBlockT() != null
//				&& !communicationMedia.getBlockT().isEmpty()) {
//			String blockt = communicationMedia.getBlockT().get(0);
//
//			String[] values = blockt.split(",");
//			if (values != null && values.length > 0) {
//				return Integer.parseInt(values[0]);
//			}
//		}
//		return latency;
//	}
//
//	private String getNetworkLatencyUnit(CommunicationMedia communicationMedia) {
//		String value = "";
//
//		if (communicationMedia != null && communicationMedia.getBlockT() != null
//				&& !communicationMedia.getBlockT().isEmpty()) {
//			String blockt = communicationMedia.getBlockT().get(0);
//
//			String[] values = blockt.split(",");
//			if (values != null && values.length > 1) {
//				String marte_unit = convertUnit(values[1]);
//				return marte_unit;
//			}
//		}
//		return value;
//	}
//
//	private Integer getNetworkCapacityValue(CommunicationMedia communicationMedia) {
//		Integer capacity = 0;
//
//		if (communicationMedia != null && communicationMedia.getCapacity() != null
//				&& !communicationMedia.getCapacity().isEmpty()) {
//			String capacity1 = communicationMedia.getCapacity().get(0);
//
//			String[] values = capacity1.split(",");
//			if (values != null && values.length > 0) {
//				return Integer.parseInt(values[0]);
//			}
//		}
//		return capacity;
//	}
//
//	private String getNetworkCapacityUnit(CommunicationMedia communicationMedia) {
//		String value = "";
//
//		if (communicationMedia != null && communicationMedia.getCapacity() != null
//				&& !communicationMedia.getCapacity().isEmpty()) {
//			String capacity = communicationMedia.getCapacity().get(0);
//
//			String[] values = capacity.split(",");
//			if (values != null && values.length > 1) {
//				// String marte_unit = convertUnit(values[1]);
//				return values[1];
//			}
//		}
//		return value;
//	}
//
//	private String convertUnit(String marte_unit) {
//		String result = marte_unit;
//		if (marte_unit.equals("ms")) {
//			result = "millisecond";
//		} else if (marte_unit.equals("s")) {
//			result = "second";
//		}
//		if (marte_unit.equals("min")) {
//			result = "min";
//		}
//		return result;
//	}

	@Override
	public EObject getElement() {

		return gcm_Study;
	}

}
