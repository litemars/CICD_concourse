package ch.uzh.parser;

import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

import org.eclipse.jdt.core.dom.MethodDeclaration;

import ch.uzh.parser.bean.ClassBean;
import ch.uzh.parser.bean.InstanceVariableBean;
import ch.uzh.parser.bean.MethodBean;

public class MethodParser {
	
	public static MethodBean parse(MethodDeclaration pMethodNode, Collection<InstanceVariableBean> pClassInstanceVariableBeans,ClassBean classe) {
		
		// Instantiate the bean
		MethodBean methodBean = new MethodBean();
		
		// Set the name
		methodBean.setName(pMethodNode.getName().toString());
		
		methodBean.setParameters(pMethodNode.parameters());
		
		methodBean.setReturnType(pMethodNode.getReturnType2());
		
		methodBean.setClassBeanContenitor(classe);
		
		
		// Set the textual content
		methodBean.setTextContent(pMethodNode.toString());
		
		// Get the names in the method
		Collection<String> names = new HashSet<String>();
		pMethodNode.accept(new NameVisitor(names));
		
		// Verify the correspondence between names and instance variables 
		Collection<InstanceVariableBean> usedInstanceVariableBeans = getUsedInstanceVariable(names, pClassInstanceVariableBeans);
		
		// Set the used instance variables
		methodBean.setUsedInstanceVariables(usedInstanceVariableBeans);
		
		// Get the invocation names
		Collection<String> invocations = new HashSet<String>();
		pMethodNode.accept(new InvocationVisitor(invocations));
				
		// Get the invocation beans from the invocation names
		Collection<MethodBean> invocationBeans = new Vector<MethodBean>();
		for (String invocation : invocations){
			invocationBeans.add(InvocationParser.parse(invocation));
		}
		
		Vector<MethodBean> vectInvocationBeans = (Vector<MethodBean>) invocationBeans;
		
		// Set the invocations
		methodBean.setMethodCalls(vectInvocationBeans);
				
		// Return the bean
		return methodBean;
		
	}
	
	private static Collection<InstanceVariableBean> getUsedInstanceVariable(Collection<String> pNames, Collection<InstanceVariableBean> pClassInstanceVariableBeans) {
		
		// Instantiate the collection to return
		Collection<InstanceVariableBean> usedInstanceVariableBeans = new Vector<InstanceVariableBean>();
		
		// Iterate over the instance variables defined in the class
		for (InstanceVariableBean classInstanceVariableBean : pClassInstanceVariableBeans)
			
			// If there is a correspondence, add to the returned collection
			if (pNames.remove(classInstanceVariableBean.getName()))
				usedInstanceVariableBeans.add(classInstanceVariableBean);
		
		// Return the collection
		return usedInstanceVariableBeans;
		
	}
	
}
