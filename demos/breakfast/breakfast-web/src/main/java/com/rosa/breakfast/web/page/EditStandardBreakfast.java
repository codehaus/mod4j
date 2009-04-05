package com.rosa.breakfast.web.page;

import java.util.Arrays;

import org.apache.wicket.markup.html.WebPage;
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

public class EditStandardBreakfast extends BasePage {

	@SpringBean(name = "breakfastService")
	BreakfastLocalService service;

	public EditStandardBreakfast(final WebPage back,
			final StandardBreakfastDto sbf) {
		setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
			protected Object load() {
				if (sbf == null) {
					StandardBreakfastDto result = new StandardBreakfastDto();
					result.setStyle(ServingStyleDto.SIMPLE);
					return result;
				}
				return sbf;
			}
		}));
		init(back);
	}

	private void init(final WebPage back) {
		Form form;
		add(form = new StandardBreakfastForm("standardBreakfastForm",
				getModel()));
		form.add(new Button("saveButton") {
			public void onSubmit() {
				StandardBreakfastDto sbf = (StandardBreakfastDto) getForm()
						.getModelObject();
				if (sbf.getId() == null) {
					service.createStandardBreakfast(sbf);
				} else {
					service.updateStandardBreakfast(sbf);
				}
				setResponsePage(ListStandardBreakfast.class);
			}
		});
		form.add(new Button("cancelButton") {
			public void onSubmit() {
				setResponsePage(back);
			}
		}.setDefaultFormProcessing(false));

	}

	private class StandardBreakfastForm extends Form {

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
		}
	}
}
