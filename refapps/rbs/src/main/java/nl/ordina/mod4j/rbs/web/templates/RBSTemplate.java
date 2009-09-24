package nl.ordina.mod4j.rbs.web.templates;

import java.util.ArrayList;
import java.util.List;

import nl.ordina.mod4j.rbs.web.RBSApplication;
import nl.ordina.mod4j.rbs.web.RBSSession;
import nl.ordina.mod4j.rbs.web.pages.breakfast.BreakfastsPage;
import nl.ordina.mod4j.rbs.web.pages.comestible.ComestiblesPage;
import nl.ordina.mod4j.rbs.web.panels.HTMLHeader;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.AbstractLink;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.PropertyModel;


public abstract class RBSTemplate extends WebPage
{
	protected RBSSession session;
	private List<AbstractLink> menuItems = new ArrayList<AbstractLink>();
	
	protected RBSTemplate()
	{
		session = RBSSession.getXDSLSession();
		
		add(new HTMLHeader("htmlHeader"));
		add(new BookmarkablePageLink("logo",RBSApplication.get().getHomePage()));
		add(new Label("pageTitle",new PropertyModel(this,"pageTitle")));

		menuItems.add((BookmarkablePageLink)new BookmarkablePageLink("link",RBSApplication.get().getHomePage()).setAutoEnable(true).add(new Label("name",getLocalizer().getString("lbl.home",this))));
		menuItems.add((BookmarkablePageLink)new BookmarkablePageLink("link",BreakfastsPage.class).setAutoEnable(true).add(new Label("name",getLocalizer().getString("lbl.breakfasts",this))));
		menuItems.add((BookmarkablePageLink)new BookmarkablePageLink("link",ComestiblesPage.class).setAutoEnable(true).add(new Label("name",getLocalizer().getString("lbl.comestibles",this))));
		add(
			new ListView("menu",new PropertyModel(this,"menuItems"))
			{
				private static final long serialVersionUID = 1L;

				@Override
				protected void populateItem(ListItem item)
				{
					item.add((AbstractLink)item.getModelObject());
				}
				
			}
		);
	}

	public abstract String getPageTitle();
	
}
