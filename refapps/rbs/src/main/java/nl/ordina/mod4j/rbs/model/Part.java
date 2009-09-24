package nl.ordina.mod4j.rbs.model;

import java.io.Serializable;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NullValue;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import nl.ordina.wicket.ext.models.BaseModel;

@PersistenceCapable(table="PART",detachable="true")
public class Part implements BaseModel, Serializable
{
	private static final long serialVersionUID = 1L;

	@Persistent(primaryKey="true",valueStrategy=IdGeneratorStrategy.NATIVE,sequence="SEQ_PART")
	@Column(name="ID",jdbcType="INTEGER")
	private Long id;
	@Persistent(column="COMESTIBLE_ID",defaultFetchGroup="true",nullValue=NullValue.EXCEPTION)
	private Comestible comestible;
	@Persistent
	@Column(name="QUANTITY",jdbcType="INTEGER",allowsNull="false")
	private int quantity;
	
	public Part()
	{
	}

	public Part(Comestible comestible, int quantity)
	{
		this.comestible = comestible;
		this.quantity = quantity;
	}
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Comestible getComestible()
	{
		return comestible;
	}
	public void setComestible(Comestible comestible)
	{
		this.comestible = comestible;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
}
