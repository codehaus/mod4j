package com.rosa.breakfast.web.page;

import static com.rosa.breakfast.web.util.ResourceUtil.msg;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.rosa.breakfast.service.BreakfastLocalService;
import com.rosa.breakfast.service.dto.ComestibleDto;

@SuppressWarnings("serial")
public class ListComestible extends BaseAppPage {

    @SpringBean(name = "breakfastService")
    private BreakfastLocalService service;

    public ListComestible() {
        add(new ListView("list", service.listAllComestible()) {
            protected void populateItem(ListItem item) {
                final ComestibleDto comestible = (ComestibleDto) item.getModelObject();
                item.add(new Link("edit") {
                    public void onClick() {
                        setResponsePage(new EditComestible(ListComestible.this, comestible));
                    }
                });
                item.add(new Link("delete") {
                    public void onClick() {
                        // TODO move this check to BL
                        // check if the comestible is used in a standard breakfast
                        if (service.isComestibleUsed(comestible).isIsUsed().booleanValue()) {
                            // if used show error message
                            error(msg("listcomestible.error.cannotdelete", this, comestible.getName()));
                            return;
                        } else {
                            // if not used delete comestible
                            service.deleteComestible(comestible);
                            detach();
                            setResponsePage(ListComestible.class);
                        }
                    }
                });
                item.add(new Label("name", comestible.getName()));
                item.add(new Label("price", comestible.getPrice().toString()));
                item.add(new Label("minimalQuantity", comestible.getMinimalQuantity().toString()));
                item.add(new Label("transportForm", comestible.getTransportForm()));
                item.add(new Label("isUsed", service.isComestibleUsed(comestible).isIsUsed().toString()));
            }
        });
        add(new Link("new") {
            public void onClick() {
                setResponsePage(new EditComestible(ListComestible.this, null));
            }
        });
        add(new FeedbackPanel("feedback"));
    }

}
