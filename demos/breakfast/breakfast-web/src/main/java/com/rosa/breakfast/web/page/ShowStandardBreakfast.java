package com.rosa.breakfast.web.page;

import java.util.Arrays;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.validation.validator.StringValidator;

import com.rosa.breakfast.service.BreakfastLocalService;
import com.rosa.breakfast.service.dto.ServingStyleDto;
import com.rosa.breakfast.service.dto.StandardBreakfastDto;

public class ShowStandardBreakfast extends BasePage {

	public ShowStandardBreakfast() {
		setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
			protected Object load() {
				StandardBreakfastDto model = new StandardBreakfastDto();
				model.setStyle(ServingStyleDto.SIMPLE);
				return model;
			}
		}));
		init();
	}

	private void init() {
		add(new StandardBreakfastForm("standardBreakfastForm", getModel()));

	}

	private class StandardBreakfastForm extends Form {

		@SpringBean
		BreakfastLocalService breakfastService;

		public StandardBreakfastForm(String id, IModel m) {
			super(id, m);

			add(new TextField("name").setRequired(true).add(
					StringValidator.maximumLength(40)));

			add(new TextField("price").setRequired(true).setType(Float.class));

			DropDownChoice style = new DropDownChoice("style", Arrays
					.asList(ServingStyleDto.values()));
			style.setRequired(true);
			style.setNullValid(false);
			add(style);

			add(new Button("saveButton") {
				public void onSubmit() {
					StandardBreakfastDto StandardBreakfast = (StandardBreakfastDto) getForm()
							.getModelObject();
					breakfastService.createStandardBreakfast(StandardBreakfast);
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
