package com.rosa.breakfast.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.validation.validator.StringValidator;

import com.rosa.breakfast.service.BreakfastLocalService;
import com.rosa.breakfast.service.dto.ComestibleDto;
import com.rosa.breakfast.web.util.DefaultFocusBehaviour;


@SuppressWarnings("serial")
public class EditComestible extends BaseAppPage {

    @SpringBean(name = "breakfastService")
    BreakfastLocalService service;

    public EditComestible(final WebPage back, final ComestibleDto c) {
        setModel(new CompoundPropertyModel(new LoadableDetachableModel() {
            protected Object load() {
                if (c == null) {
                    ComestibleDto result = new ComestibleDto();
                    return result;
                }
                return c;
            }
        }));

        Form form = new ComestibleForm("comestibleForm", getModel());
        form.add(new Button("saveButton") {
            public void onSubmit() {
                ComestibleDto c = (ComestibleDto) getForm().getModelObject();
                if (c.getId() == null) {
                    service.createComestible(c);
                } else {
                    service.updateComestible(c);
                }
                setResponsePage(ListComestible.class);
            }
        });
        form.add(new Button("cancelButton") {
            public void onSubmit() {
                setResponsePage(back);
            }
        }.setDefaultFormProcessing(false));
        add(form);

        add(new FeedbackPanel("feedback"));
    }

    private class ComestibleForm extends Form {

        public ComestibleForm(String id, IModel m) {
            super(id, m);
            add(new TextField("name").setRequired(true).add(StringValidator.maximumLength(40)).add(
                    new DefaultFocusBehaviour()));
            add(new TextField("price").setRequired(true).setType(Float.class));
            add(new TextField("minimalQuantity").setRequired(true).setType(Integer.class));
            add(new TextField("transportForm"));
        }
    }
}
