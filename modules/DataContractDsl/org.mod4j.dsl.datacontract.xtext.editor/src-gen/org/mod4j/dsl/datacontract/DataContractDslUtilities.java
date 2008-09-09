package org.mod4j.dsl.datacontract;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.IXtextParser;

import org.mod4j.dsl.datacontract.parser.XtextParser;

public class DataContractDslUtilities extends AbstractLanguageUtilities {

	@Override
	protected IXtextParser internalParse(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

	public String getFileExtension() {
		return "dtcmod";
	}

	public EPackage getEPackage() {
		return org.mod4j.dsl.datacontract.MetaModelRegistration.getEPackage();
	}

	List<String> r = new ArrayList<String>();
	{
		r.add("ListDto");
		r.add("base");
		r.add("string");
		r.add("DataContract");
		r.add("CustomDto");
		r.add("DomainDto");
		r.add("boolean");
		r.add("import");
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
		return DataContractDslEditorPlugin.getDefault();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "org::mod4j::dsl::datacontract";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
}
