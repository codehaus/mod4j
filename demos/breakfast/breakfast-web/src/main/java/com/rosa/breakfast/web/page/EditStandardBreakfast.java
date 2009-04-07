package com.rosa.breakfast.web.page;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.validation.validator.StringValidator;

import com.rosa.breakfast.data.PartDao;
import com.rosa.breakfast.service.BreakfastLocalService;
import com.rosa.breakfast.service.dto.PartDto;
import com.rosa.breakfast.service.dto.ServingStyleDto;
import com.rosa.breakfast.service.dto.StandardBreakfastDto;

public class EditStandardBreakfast extends BaseAppPage {

	@SpringBean(name = "breakfastService")
	BreakfastLocalService service;

	private StandardBreakfastDto selectedStandardBreakfast;
	
	public EditStandardBreakfast(final Long id, String dummy) {
		setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
			protected Object load() {
				StandardBreakfastDto result = null;
				if (id == null) {
					result = new StandardBreakfastDto();
					result.setStyle(ServingStyleDto.SIMPLE);
					return result;
				} else {
					result = service.readStandardBreakfastAsStandardBreakfastDto(id);
				}
				selectedStandardBreakfast = result;
				return result;
			}
		}));
		init();
	}

	public EditStandardBreakfast(final StandardBreakfastDto sbf) {
		setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
			protected Object load() {
				if (sbf == null) {
					StandardBreakfastDto result = new StandardBreakfastDto();
					result.setStyle(ServingStyleDto.SIMPLE);
					return result;
				}
				selectedStandardBreakfast = sbf;
				return sbf;
			}
		}));
		init();
	}

	private void init() {
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
				setResponsePage(ListStandardBreakfast.class);
			}
		}.setDefaultFormProcessing(false));
		form.add(new ListView("list", new ArrayList<PartDto>(((StandardBreakfastDto)getModelObject()).getParts())) {
			protected void populateItem(ListItem item) {
				final PartDto part = (PartDto) item
						.getModelObject();
				item.add(new Label("name", part.getComestible().getName()));
				item.add(new Label("quantity", part.getQuantity().toString()));
				item.add(new Link("edit") {
					public void onClick() {
						setResponsePage(new EditStandardBreakfastPart(
								EditStandardBreakfast.this, part));
					}
				});
				item.add(new Link("delete") {
					public void onClick() {
						service.deletePart(part);
						detach();
						setResponsePage(new EditStandardBreakfast(selectedStandardBreakfast.getId(), ""));
					}
				});

			}
		});
		form.add(new Link("new") {
			public void onClick() {
				setResponsePage(new EditStandardBreakfastPart(
						EditStandardBreakfast.this, null));
			}
		});
		add(new FeedbackPanel("feedback"));
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