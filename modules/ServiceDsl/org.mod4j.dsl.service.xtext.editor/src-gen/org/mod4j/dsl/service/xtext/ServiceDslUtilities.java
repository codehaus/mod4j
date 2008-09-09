package org.mod4j.dsl.service.xtext;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.IXtextParser;

import org.mod4j.dsl.service.xtext.parser.XtextParser;

public class ServiceDslUtilities extends AbstractLanguageUtilities {

	@Override
	protected IXtextParser internalParse(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

	public String getFileExtension() {
		return "sermod";
	}

	public EPackage getEPackage() {
		return org.mod4j.dsl.service.xtext.MetaModelRegistration.getEPackage();
	}

	List<String> r = new ArrayList<String>();
	{
		r.add("update");
		r.add("end");
		r.add("delete");
		r.add("import");
		r.add("Service");
		r.add("out");
		r.add("create");
		r.add("crud");
		r.add("custom");
		r.add("in");
		r.add("method");
		r.add("for");
		r.add("read");
	}
	public List<String> allKeywords() {
		return r;
	}

	protected ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return new GeneratedPartitionScanner();
	}

	@Override
	public AbstractXtextEditorPlugin getXtextEditorPlugin() {
		return ServiceDslEditorPlugin.getDefault();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "org::mod4j::dsl::service::xtext";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
}
