package nl.ordina.wicket.ext.components;

import org.apache.wicket.behavior.HeaderContributor;

public class ModalWindow extends org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow
{
	private static final long serialVersionUID = 1L;
	
	public ModalWindow(String id)
	{
		super(id);
		//remove(contributors.get(1));
		add(HeaderContributor.forCss("css/modal.css"));
	}

}
