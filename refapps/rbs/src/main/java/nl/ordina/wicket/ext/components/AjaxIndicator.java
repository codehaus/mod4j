package nl.ordina.wicket.ext.components;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.markup.parser.XmlTag;

public class AjaxIndicator extends WebComponent
{
	private static final long serialVersionUID = 1L;

	public AjaxIndicator(String id)
	{
		super(id);
		setMarkupId("ajaxIndicator");
		setRenderBodyOnly(true);
		//setOutputMarkupId(true);
	}

	@Override
	protected void onComponentTagBody(MarkupStream markupStream, ComponentTag openTag)
	{
		replaceComponentTagBody(markupStream, openTag, "<img style=\"display:none;\" id=\"" + getMarkupId() + "\" src=\"resources/org.apache.wicket.ajax.AbstractDefaultAjaxBehavior/indicator.gif\"/>");
	}
	
	@Override
	protected void onComponentTag(ComponentTag tag)
	{
		super.onComponentTag(tag);
		// always transform the tag to <span></span> so even labels defined as <span/> render
		tag.setType(XmlTag.OPEN);
	}
}
