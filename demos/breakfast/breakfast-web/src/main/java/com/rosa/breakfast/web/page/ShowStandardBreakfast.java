package com.rosa.breakfast.web.page;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.validation.validator.StringValidator;

import com.rosa.breakfast.service.dto.StandardBreakfastDto;


public class ShowStandardBreakfast extends BasePage {

	// private String personeelsNummer;

	// @SpringBean
	// private BreakfastLocalService breakfastService;

	public ShowStandardBreakfast() {
		setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
			protected Object load() {
				StandardBreakfastDto standardBreakfast = new StandardBreakfastDto();
				return standardBreakfast;
			}
		}));
		init();
	}

	private void init() {
		add(new ItemForm("form", getModel()));

	}

	private class ItemForm extends Form {

		public ItemForm(String id, IModel m) {
			super(id, m);

			TextField name = new TextField("name");
			name.setRequired(true);
			name.add(StringValidator.maximumLength(40));
			add(name);

			TextField price = new TextField("price");
			price.setRequired(true);
			price.add(StringValidator.maximumLength(10));
			add(price);

			add(new Button("saveButton") {
				public void onSubmit() {
					StandardBreakfastDto StandardBreakfast = (StandardBreakfastDto) getForm()
							.getModelObject();
					setResponsePage(ShowStandardBreakfast.class);
				}
			});
			add(new Button("cancelButton") {
				public void onSubmit() {
					setResponsePage(ShowStandardBreakfast.class);
				}
			}.setDefaultFormProcessing(false));

		}
	}

}
