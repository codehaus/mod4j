package com.rosa.breakfast.web.page;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.rosa.breakfast.service.BreakfastLocalService;
import com.rosa.breakfast.service.dto.PartDto;
import com.rosa.breakfast.service.dto.StandardBreakfastDto;

@SuppressWarnings("serial")
public class ListStandardBreakfast extends BaseAppPage {

    @SpringBean(name = "breakfastService")
    private BreakfastLocalService service;

    public ListStandardBreakfast() {
        add(new ListView("list", service.listAllStandardBreakfast()) {
            protected void populateItem(ListItem item) {
                final StandardBreakfastDto breakfast = (StandardBreakfastDto) item.getModelObject();
                // add edit button
                item.add(new Link("edit") {
                    public void onClick() {
                        setResponsePage(new EditStandardBreakfast(breakfast, false));
                    }
                });
                // add delete button
                item.add(new Link("delete") {
                    public void onClick() {
                        service.deleteStandardBreakfast(breakfast);
                        detach();
                        setResponsePage(ListStandardBreakfast.class);
                    }
                });
                // add column values
                item.add(new Label("name", breakfast.getName()));
                item.add(new Label("price", breakfast.getPrice().toString()));
                item.add(new Label("style.name", breakfast.getStyle().name()));
            }
        });
        // add new button
        add(new Link("new") {
            public void onClick() {
                setResponsePage(new EditStandardBreakfast());
            }
        });
    }
}
