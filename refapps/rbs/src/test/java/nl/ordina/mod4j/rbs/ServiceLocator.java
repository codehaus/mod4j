package nl.ordina.mod4j.rbs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceLocator
{
	private static ServiceLocator serviceLocator;

	private ApplicationContext context;
	
	private ServiceLocator()
	{
		context = new ClassPathXmlApplicationContext(
			new String[] {"nl/ordina/mod4j/rbs/applicationContext.xml","nl/ordina/mod4j/rbs/applicationConfig.xml"}
		);
	}
	
	public static ServiceLocator getInstance()
	{
		if (serviceLocator == null)
			serviceLocator = new ServiceLocator(); 
		return serviceLocator;
	}

	public Object get(String id)
	{
		return context.getBean(id);
	}
	
}
