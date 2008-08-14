package org.mod4j.dslcommon.openarchitectureware;

import org.mod4j.dslcommon.io.DirectoryWalker;

public class TestCodegen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DslExtension dsl = new DslExtension("BusinessDomainDsl", 
									"BusinessDomainDsl", 
									"BusinessDomainDsl.BusinessDomainDslPackage", 
									".busmod", 
									"crossx/busmod2crossx2.oaw", 
									"src/workflow/busmod.oaw", 
									"src/workflow/busmod.properties");
		
		String dir = "D:/mod4j/repository/modules/RecordShop-ExampleProject/RecordShop.BusinessDomain.model";

		execute(dir, dsl);
	}
	public static void execute(String projectDir, DslExtension dsl) {
		DirectoryWalker walker = new DirectoryWalker();
		CrossxDirectoryVisitor vis = new CrossxDirectoryVisitor(dsl, projectDir);
		walker.walk(projectDir, vis	);
		CodegenDirectoryVisitor codegen = new CodegenDirectoryVisitor(dsl, projectDir);
		walker.walk(projectDir, codegen);
	}

}
