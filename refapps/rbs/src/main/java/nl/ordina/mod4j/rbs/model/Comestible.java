package nl.ordina.mod4j.rbs.model;

import java.io.Serializable;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.Unique;

import nl.ordina.wicket.ext.models.BaseModel;

@PersistenceCapable(table="COMESTIBLE",detachable="true")
public class Comestible implements BaseModel, Serializable
{
	private static final long serialVersionUID = 1L;
	@Persistent(primaryKey="true",valueStrategy=IdGeneratorStrategy.NATIVE,sequence="SEQ_COMESTIBLE")
	@Column(name="ID",jdbcType="INTEGER")
	private Long id;
	@Persistent
	@Column(name="NAME",jdbcType="VARCHAR",length=32,allowsNull="false")
	@Unique(name="UNIQUE_COMESTIBLE_NAME")
	private String name;
	@Persistent
	@Column(name="MINIMAL_QUANTITY",jdbcType="INTEGER",allowsNull="false")
	private int minimalQuantity;
	@Persistent
	@Column(name="PRICE",jdbcType="DOUBLE",allowsNull="false")
	private double price;
	@Persistent
	@Column(name="TRANSPORT_FORM",jdbcType="VARCHAR",length=32,allowsNull="true")
	private String transportForm;

	public Comestible()
	{
	}
	
	public Comestible(String name, int minimalQuantity, double price, String transportForm)
	{
		this.name = name;
		this.minimalQuantity = minimalQuantity;
		this.price = price;
		this.transportForm = transportForm;
	}
	public Comestible(Long id, String name, int minimalQuantity, double price, String transportForm)
	{
		this.id = id;
		this.name = name;
		this.minimalQuantity = minimalQuantity;
		this.price = price;
		this.transportForm = transportForm;
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
	public int getMinimalQuantity()
	{
		return minimalQuantity;
	}
	public void setMinimalQuantity(int minimalQuantity)
	{
		this.minimalQuantity = minimalQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public String getTransportForm()
	{
		return transportForm;
	}
	public void setTransportForm(String transportForm)
	{
		this.transportForm = transportForm;
	}
}
