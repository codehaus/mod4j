package com.rosa.breakfast.web.page;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.rosa.breakfast.service.BreakfastLocalService;
import com.rosa.breakfast.service.dto.ComestibleDto;
import com.rosa.breakfast.service.dto.PartDto;
import com.rosa.breakfast.service.dto.StandardBreakfastDto;

public class EditStandardBreakfastPart extends BaseAppPage {

	@SpringBean(name = "breakfastService")
	BreakfastLocalService service;

	private WebPage back;

	public EditStandardBreakfastPart(final WebPage back,
			final PartDto part) {
		setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
			protected Object load() {
				if (part == null) {
					PartDto result = new PartDto();
					return result;
				}
				return part;
			}
		}));
		this.back = back;
		init();
	}

	private void init() {
		Form form = new StandardBreakfastForm("standardBreakfastForm", getModel());
		add(form);
		add(new FeedbackPanel("feedback"));
	}

	private class StandardBreakfastForm extends Form {
		
		private ComestibleDto selectedComestible;

		public StandardBreakfastForm(String id, IModel m) {
			super(id, m);
			selectedComestible = ((PartDto)getModelObject()).getComestible();
			final DropDownChoice comestibleChoice = new DropDownChoice("comestibles", new PropertyModel(this, "selectedComestible"), getAllComestibles());          
			comestibleChoice.setChoiceRenderer(new ComestibleChoiceRenderer());
			comestibleChoice.setOutputMarkupId(true);
			comestibleChoice.setRequired(true);
			comestibleChoice.setNullValid(false);
			add(comestibleChoice);
			add(new TextField("quantity").setRequired(true).setType(Float.class));
			add(new Button("saveButton") {
				public void onSubmit() {
					PartDto part = (PartDto) getForm()
							.getModelObject();
					if (part.getId() == null) {
						part = service.createPart(part);
					} else {
						part = service.updatePart(part);
					}
					service.setComestible(part, selectedComestible);
					StandardBreakfastDto breakfast = (StandardBreakfastDto)back.getModelObject();
					service.addToParts(breakfast, part);
					setResponsePage(back);
				}
			});
			add(new Button("cancelButton") {
				public void onSubmit() {
					setResponsePage(back);
				}
			}.setDefaultFormProcessing(false));
		}
		
	}
	
	private class ComestibleChoiceRenderer implements IChoiceRenderer {	
		private static final long serialVersionUID = 1L;

		public Object getDisplayValue(Object o) {
			ComestibleDto comestible = (ComestibleDto) o;
			return comestible.getName();
		}

		public String getIdValue(Object o, int i) {
			ComestibleDto comestible = (ComestibleDto) o;
			return comestible.getId() + "";
		}
	}

	private IModel getAllComestibles() {
		IModel comestibleChoices = new AbstractReadOnlyModel() {
			@Override
			public List<ComestibleDto> getObject() {                  
				List<ComestibleDto> allComestibles = service.listAllComestible();
				return allComestibles;
			}
		};
		return comestibleChoices;
	}
	
}
