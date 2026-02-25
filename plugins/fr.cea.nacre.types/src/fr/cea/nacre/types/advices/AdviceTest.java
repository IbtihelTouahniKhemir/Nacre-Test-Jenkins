package fr.cea.nacre.types.advices;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.uml.types.core.advices.applystereotype.ApplyStereotypeAdviceConfiguration;
import org.eclipse.papyrus.uml.types.core.advices.applystereotype.ApplyStereotypeAdviceEditHelperAdvice;

public class AdviceTest extends ApplyStereotypeAdviceEditHelperAdvice{

	public AdviceTest(ApplyStereotypeAdviceConfiguration configuration) {
		super(configuration);
		// TODO Auto-generated constructor stub
	}
@Override
protected ICommand getAfterCreateCommand(CreateElementRequest request) {
	// TODO Auto-generated method stub
	return super.getAfterCreateCommand(request);
}
@Override
protected ICommand getAfterSetCommand(SetRequest request) {
	// TODO Auto-generated method stub
	return super.getAfterSetCommand(request);
}
}
