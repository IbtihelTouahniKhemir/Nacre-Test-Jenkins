package fr.cea.nacre.types.advices;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.uml.types.core.edithelper.DefaultUMLEditHelperAdvice;
import org.eclipse.papyrus.uml.types.core.requests.ApplyStereotypeRequest;
import org.eclipse.uml2.uml.Element;

import fr.cea.nacre.types.advices.command.SetValueZonalControllerCommand;
import nacre.ZonalController;
import nacre.ControlType;

public class  ZonalControllerAdvice extends DefaultUMLEditHelperAdvice {
	
@Override
protected ICommand getAfterApplyStereotypeCommand(ApplyStereotypeRequest req) {
	
	if(req.getStereotype().getName().equals(ZonalController.class.getSimpleName())) {
		Element element = req.getUmlElement();
		SetValueZonalControllerCommand cmd= new SetValueZonalControllerCommand(element, req,ControlType.MPC_RTE);
			return cmd;

	}
	return super.getAfterApplyStereotypeCommand(req);
}

}
