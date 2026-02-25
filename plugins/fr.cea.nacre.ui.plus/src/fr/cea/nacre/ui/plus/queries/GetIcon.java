package fr.cea.nacre.ui.plus.queries;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.papyrus.emf.facet.custom.metamodel.custompt.IImage;
import org.eclipse.papyrus.emf.facet.custom.ui.ImageUtils;
import org.eclipse.papyrus.emf.facet.custom.ui.internal.custompt.URIImage;
import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.efacet.metamodel.v0_2_0.efacet.ParameterValue;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.uml.tools.providers.UMLLabelProvider;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

import fr.cea.nacre.model.NACREMM.cfa.MainGrid;
import nacre.Battery;
import nacre.Bus;
import nacre.CentralController;
import nacre.Generator;
import nacre.LocalController;
import nacre.Substation;
import nacre.Zone;


public class GetIcon implements IJavaQuery2<EObject, IImage> {
	private static final UMLLabelProvider UML_LABEL_PROVIDER= new UMLLabelProvider();
	public IImage evaluate(final EObject context, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		if(context instanceof Element) {
			if(UMLUtil.getStereotypeApplication(((Element)context), nacre.Line.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/line.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), nacre.MainGrid.class)!=null){
				ParameterValue parameterValue = parameterValues.getParameterValueByName("eRef"); //$NON-NLS-1$
				if (parameterValue.getValue() instanceof EReference) {
					String name=((EReference) parameterValue.getValue()).getName();
					if("lines".equals(name)) {
						return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/line.png");
					}
				}
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/maingrid.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), CommunicationMedia.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/network.png");
			}
			
			if(UMLUtil.getStereotypeApplication(((Element)context), Zone.class)!=null){
				ParameterValue parameterValue = parameterValues.getParameterValueByName("eRef"); //$NON-NLS-1$
				if (parameterValue.getValue() instanceof EReference) {
					String name=((EReference) parameterValue.getValue()).getName();
					if("lines".equals(name)) {
						return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/line.png");
					}
				}
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/zone.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), Substation.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/substation.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), CentralController.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/modelExplorer/appointment-soon.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), Battery.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/modelExplorer/battery-charging.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), LocalController.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/modelExplorer/clock-play.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), Generator.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/modelExplorer/quickopen.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), Substation.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/modelExplorer/kblackbox-3.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), Bus.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/modelExplorer/network-nfs-2.png");
			}
			if(UMLUtil.getStereotypeApplication(((Element)context), ComputingResource.class)!=null){
				return new URIImage("platform:/plugin/fr.cea.nacre.ui.plus/icons/modelExplorer/computer-server-rack_mount.png");
			}
		}
		return ImageUtils.wrap(UML_LABEL_PROVIDER.getImage(context));
	}


}