
/**
 * Extension point, initially generated by Mod4j. 

 *     Application model: HandleCustomer
 *     Generator        :  Mod4j PresentationDsl generator: GenerateBatchProcess  in Process.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j to its original state.
 */

package org.company.recordshop.presentation.processes;

import org.company.recordshop.presentation.dataproviders.Mod4jDataProvider;
import org.company.recordshop.presentation.pages.RecordShopMasterPage;
import org.company.recordshop.presentation.pages.RecordShopHomePage;
import org.company.recordshop.service.dto.SimpleCustomerDto;

import java.util.List;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.Page;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.markup.repeater.data.ListDataProvider;

/** Automated process
 */
public class HandleCustomerProcess extends HandleCustomerProcessImplBase {
	public HandleCustomerProcess(IModel context) {
		super(context);
	}

	public void run(SimpleCustomerDto element) {
		// TODO: Implement run action for Custom batch process
		throw new RuntimeException(
				"Process HandleCustomer is not iomplemented yet");
	}

}
