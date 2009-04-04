package com.rosa.breakfast.web.page;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;

public class Login extends BasePage {

//	private String personeelsNummer;

//	@SpringBean
//	private BreakfastLocalService breakfastService;

	public Login() {
		// setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
		// protected Object load() {
		// MedewerkerDto medewerker = new MedewerkerDto();
		// return medewerker;
		// }
		// }));
		init();
	}

	private void init() {
        add(new ItemForm("form", getModel()));

	}

	private class ItemForm extends Form {

		public ItemForm(String id, IModel m) {
			super(id, m);

		}
	}

}
