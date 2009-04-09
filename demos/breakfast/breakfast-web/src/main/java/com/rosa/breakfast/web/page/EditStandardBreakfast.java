package com.rosa.breakfast.web.page;

import static com.rosa.breakfast.web.util.ResourceUtil.msg;

import java.util.ArrayList;
import java.util.Arrays;

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
import org.springframework.dao.DataIntegrityViolationException;

import com.rosa.breakfast.service.BreakfastLocalService;
import com.rosa.breakfast.service.dto.PartDto;
import com.rosa.breakfast.service.dto.ServingStyleDto;
import com.rosa.breakfast.service.dto.StandardBreakfastDto;
import com.rosa.breakfast.web.util.DefaultFocusBehaviour;

@SuppressWarnings("serial")
public class EditStandardBreakfast extends BaseAppPage {

	@SpringBean(name = "breakfastService")
	BreakfastLocalService service;

	private StandardBreakfastDto selectedStandardBreakfast;

	public EditStandardBreakfast() {
		this(null, false);
	}

	public EditStandardBreakfast(final StandardBreakfastDto sbf, final boolean refresh) {
		setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
			protected Object load() {
				StandardBreakfastDto standardBreakfast = sbf;
				if (refresh && standardBreakfast != null) {
					standardBreakfast = service.readStandardBreakfastAsStandardBreakfastDto(standardBreakfast.getId());
				}
				if (standardBreakfast == null) {
					standardBreakfast = new StandardBreakfastDto();
					standardBreakfast.setStyle(ServingStyleDto.SIMPLE);
				}
				selectedStandardBreakfast = standardBreakfast;
				return standardBreakfast;
			}
		}));
		init();
	}

	private void init() {
		add(new StandardBreakfastForm("standardBreakfastForm", getModel()));
		add(new FeedbackPanel("feedback"));
	}

	private class StandardBreakfastForm extends Form {

		public StandardBreakfastForm(String id, IModel m) {
			super(id, m);
			// add textfields and dropdown
			add(new TextField("name").setRequired(true).add(StringValidator.maximumLength(40)).add(new DefaultFocusBehaviour()));
			add(new TextField("price").setRequired(true).setType(Float.class));

			DropDownChoice style = new DropDownChoice("style", Arrays.asList(ServingStyleDto.values()));
			style.setRequired(true);
			style.setNullValid(false);
			add(style);
			
			// add buttons
			add(new Button("saveButton") {
				public void onSubmit() {
					StandardBreakfastDto sbf = (StandardBreakfastDto) getForm().getModelObject();
					try {
						if (sbf.getId() == null) {
							service.createStandardBreakfast(sbf);
						} else {
							service.updateStandardBreakfast(sbf);
						}
					} catch(DataIntegrityViolationException e) {
						error(msg("editstandardbreakfast.error.duplicate.name", this, sbf.getName()));
						return;
					}
					setResponsePage(ListStandardBreakfast.class);
				}
			});
			add(new Button("cancelButton") {
				public void onSubmit() {
					setResponsePage(ListStandardBreakfast.class);
				}
			}.setDefaultFormProcessing(false));
			
			// add comestibles table for this standard breakfast
			add(new ListView("list", new ArrayList<PartDto>(((StandardBreakfastDto)getModelObject()).getParts())) {
				protected void populateItem(ListItem item) {
					final PartDto part = (PartDto) item
					.getModelObject();
					item.add(new Label("name", part.getComestible().getName()));
					item.add(new Label("quantity", part.getQuantity().toString()));
					item.add(new Link("edit") {
						public void onClick() {
							setResponsePage(new EditStandardBreakfastPart(selectedStandardBreakfast, part));
						}
					});
					item.add(new Link("delete") {
						public void onClick() {
							service.deletePart(part);
							detach();
							setResponsePage(new EditStandardBreakfast(selectedStandardBreakfast, true));
						}
					});
				}
			});
			// add add commestible button
			Link add = new Link("add") {
				public void onClick() {
					setResponsePage(new EditStandardBreakfastPart(selectedStandardBreakfast, null));
				}
			}; 
			// disable button if standard breakfast is not created yet
			add.setEnabled(((StandardBreakfastDto)getModelObject()).getId() != null);
			add(add);
		}
	}

}
