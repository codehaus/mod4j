package nl.ordina.mod4j.rbs.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.Element;
import javax.jdo.annotations.FetchGroup;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.Unique;

import nl.ordina.wicket.ext.models.BaseModel;

@PersistenceCapable(table="BREAKFAST",detachable="true")
@FetchGroup(name="default",members={@Persistent(name="id"),@Persistent(name="name"),@Persistent(name="price"),@Persistent(name="servingStyle")})
public class Breakfast implements BaseModel, Serializable
{
	public enum ServingStyle
	{
		SIMPLE(1), GRAND(2), DELUXE(3);
		
		private final int value;
		
		ServingStyle(int value)
		{
			this.value = value;
		}
		
		public final int getValue()
		{
			return value;
		}
		
		public final static Enum<ServingStyle> getEnum(int value)
		{
			switch(value)
			{
				case 1: return ServingStyle.SIMPLE;
				case 2: return ServingStyle.GRAND;
				case 3: return ServingStyle.DELUXE;
				default: return null;
			}
		}
	};
	
	private static final long serialVersionUID = 1L;

	@Persistent(primaryKey="true",valueStrategy=IdGeneratorStrategy.NATIVE,sequence="SEQ_BREAKFAST")
	@Column(name="ID",jdbcType="INTEGER")
	private Long id;
	@Persistent
	@Column(name="NAME",jdbcType="VARCHAR",length=32,allowsNull="false")
	@Unique(name="UNIQUE_BREAKFAST_NAME")
	private String name;
	//@NotPersistent
	@Persistent
	@Column(name="PRICE",jdbcType="DOUBLE",allowsNull="false")
	private double price;
	@Persistent
	//@Column(name="SERVING_STYLE",jdbcType="INTEGER",allowsNull="false")
	@Column(name="SERVING_STYLE",jdbcType="VARCHAR",length=32,allowsNull="false")
	private ServingStyle servingStyle;
	@Persistent(defaultFetchGroup="true")
	@Element(column="BREAKFAST_ID",types=nl.ordina.mod4j.rbs.model.Part.class,indexed="false")
	private Collection<Part>parts = new HashSet<Part>();

	public Breakfast()
	{
	}
	
	public Breakfast(String name, double price, ServingStyle servingStyle)
	{
		this.name = name;
		this.price = price;
		this.servingStyle = servingStyle;
	}
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public ServingStyle getServingStyle()
	{
		return servingStyle;
	}
	public void setServingStyle(ServingStyle servingStyle)
	{
		this.servingStyle = servingStyle;
	}
	public Collection<Part> getParts()
	{
		return parts;
	}
	public void setParts(Collection<Part> parts)
	{
		this.parts = parts;
	}
}
