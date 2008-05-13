
package org.mod4j.businessdomain.xtext.parser;

import java.io.InputStream;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.check.CheckFacade;
import org.openarchitectureware.emf.EcoreUtil2;
import org.openarchitectureware.expression.ExecutionContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.issues.IssuesImpl;
import org.openarchitectureware.workflow.util.ResourceLoader;
import org.openarchitectureware.workflow.util.ResourceLoaderFactory;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;

public class XtextParser extends GenParser {

	public XtextParser(InputStream in) {
		super(in);
	}
	
	public Issues doCheck() {
		IssuesImpl issues = new IssuesImpl();
		ResourceLoader cl = ResourceLoaderFactory.createResourceLoader();
		try {
			ResourceLoaderFactory.setCurrentThreadResourceLoader(new ResourceLoaderImpl(GenParser.class.getClassLoader()));
			ExecutionContext ctx = getExecutionContext();
			Collection<EObject> allElements = EcoreUtil2.allContents(getRootNode().getModelElement());
			allElements.add(getRootNode().getModelElement());
//			String[] checkFiles = new String[]{"org::mod4j::businessdomain::xtext::GenChecks","org::mod4j::businessdomain::xtext::Checks"};
			String[] checkFiles = new String[]{
					"org::mod4j::businessdomain::xtext::GenChecks",
					"BusinessDomainDsl::validation::BusinessModelChecks"};
			for (String checkFile : checkFiles) {
				CheckFacade.checkAll(checkFile, allElements, ctx, issues);
			}
		} catch (Exception e) {
			issues.addError("Error during validation phase : "+e.getMessage(), getRootNode().getModelElement());
		} finally {
			ResourceLoaderFactory.setCurrentThreadResourceLoader(cl);
		}
		return issues;
	}


}
