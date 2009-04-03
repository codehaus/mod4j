package com.rosa.breakfast.web.page;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import com.rosa.breakfast.service.dto.StandardBreakfastDto;

public class ShowStandardBreakfast extends BasePage {

	// private String personeelsNummer;

	// @SpringBean
	// private BreakfastLocalService breakfastService;

	public ShowStandardBreakfast() {
		setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
			protected Object load() {
				StandardBreakfastDto medewerker = new StandardBreakfastDto();
				return medewerker;
			}
		}));
		init();
	}

	private void init() {

	}

	private class ItemForm extends Form {

		public ItemForm(String id, IModel m) {
			super(id, m);
		}
	}

}
