package com.rosa.breakfast.web.page;

import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
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
import com.rosa.breakfast.web.util.DefaultFocusBehaviour;

@SuppressWarnings("serial")
public class EditStandardBreakfastPart extends BaseAppPage {

    @SpringBean(name = "breakfastService")
    BreakfastLocalService service;

    private StandardBreakfastDto breakfast;

    public EditStandardBreakfastPart(final StandardBreakfastDto breakfast, final PartDto part) {
        setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
            protected Object load() {
                if (part == null) {
                    PartDto result = new PartDto();
                    return result;
                }
                return part;
            }
        }));
        this.breakfast = breakfast;

        add(new StandardBreakfastPartForm("standardBreakfastForm", getModel()));
        add(new FeedbackPanel("feedback"));
    }

    private class StandardBreakfastPartForm extends Form {

        private ComestibleDto selectedComestible;

    	public StandardBreakfastPartForm(String id, IModel m) {
            super(id, m);
            selectedComestible = ((PartDto) getModelObject()).getComestible();
            final DropDownChoice comestibleChoice = new DropDownChoice("comestibles", new PropertyModel(this,
                    "selectedComestible"), getAllComestibles());
            comestibleChoice.setChoiceRenderer(new ComestibleChoiceRenderer());
            comestibleChoice.setOutputMarkupId(true);
            comestibleChoice.setRequired(true);
            comestibleChoice.setNullValid(false);
            final TextField quantity = new TextField("quantity");
            quantity.setOutputMarkupId(true);
            quantity.setRequired(true);
            quantity.setType(Float.class);
            
            comestibleChoice.add(new AjaxFormComponentUpdatingBehavior("onchange") {
				@Override
				protected void onUpdate(AjaxRequestTarget target)
				{
					if (selectedComestible != null) {
						quantity.setModelObject(new Float(selectedComestible.getMinimalQuantity()));
						target.addComponent(quantity);
					}
				}
			});

            if (selectedComestible == null) {
                comestibleChoice.add(new DefaultFocusBehaviour());
            } else {
            	comestibleChoice.setEnabled(false);
            	quantity.add(new DefaultFocusBehaviour());
            }

            add(comestibleChoice);
            add(quantity);
            add(new Button("saveButton") {
                public void onSubmit() {
                    PartDto part = (PartDto) getForm().getModelObject();
                    if (part.getId() == null) {
                        // create a new part
                        part = service.createPart(part);
                    } else {
                        // update a part
                        part = service.updatePart(part);
                    }
                    // create association between the part and the selected Comestible
                    service.setComestible(part, selectedComestible);
                    // create association between the standard breakfast and the part
                    service.addToParts(breakfast, part);
                    setResponsePage(new EditStandardBreakfast(breakfast, true));
                }
            });
            
            add(new Button("cancelButton") {
            	public void onSubmit() {
               		setResponsePage(new EditStandardBreakfast(breakfast, false));
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
