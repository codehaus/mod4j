package nl.ordina.mod4j.rbs.web.feedback;

import org.apache.wicket.feedback.FeedbackMessage;
import org.apache.wicket.feedback.IFeedbackMessageFilter;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

public class FormFeedbackPanel extends FeedbackPanel
{
	private static final long serialVersionUID = 1L;

	public FormFeedbackPanel(String id, IFeedbackMessageFilter filter)
	{
		super(id,filter);
		WebMarkupContainer feedbackul = (WebMarkupContainer) get("feedbackul");
		ListView messages = (ListView)feedbackul.get("messages");
		//messages.setVisible(feedbackul.isVisible());
		remove(feedbackul);
		add(messages);
	}

	@Override
	protected String getCSSClass(FeedbackMessage message)
	{
		return "errorNotifier";
	}
}
