/**
 * 
 */
package com.tango.model;

/**
 * @author Esteban Enoc
 *
 */


import java.util.ArrayList; 
import java.util.List;  
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@XmlRootElement
@Entity(name="comida")
public class Comida extends BaseObject {

	private static final long serialVersionUID = 4253758174925598379L;
	private Long ComidaID;
	private String Nombre;
	private String Descripcion;
	private String Dias;
	private TipoComida TipoComida; 
	private List<Menu> menus = new ArrayList<Menu>();
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comida [ComidaID=" + ComidaID + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Dias=" + Dias
				+ ", TipoComida=" + TipoComida + ", menus=" + menus + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ComidaID == null) ? 0 : ComidaID.hashCode());
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + ((Dias == null) ? 0 : Dias.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((TipoComida == null) ? 0 : TipoComida.hashCode());
		result = prime * result + ((menus == null) ? 0 : menus.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comida other = (Comida) obj;
		if (ComidaID == null) {
			if (other.ComidaID != null)
				return false;
		} else if (!ComidaID.equals(other.ComidaID))
			return false;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (Dias == null) {
			if (other.Dias != null)
				return false;
		} else if (!Dias.equals(other.Dias))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (TipoComida == null) {
			if (other.TipoComida != null)
				return false;
		} else if (!TipoComida.equals(other.TipoComida))
			return false;
		if (menus == null) {
			if (other.menus != null)
				return false;
		} else if (!menus.equals(other.menus))
			return false;
		return true;
	}
	/**
	 * @return the comidaID
	 */
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	public Long getComidaID() {
		return ComidaID;
	}
	/**
	 * @param comidaID the comidaID to set
	 */
	public void setComidaID(Long comidaID) {
		ComidaID = comidaID;
	}
	/**
	 * @return the nombre
	 */
	@Column(name="Nombre", length=50) 
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return the descripcion
	 */
	@Column(name="Descripcion", length=50) 
	public String getDescripcion() {
		return Descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	/**
	 * @return the dias
	 */
	@Column(name="Dias", length=50) 
	public String getDias() {
		return Dias;
	}
	/**
	 * @param dias the dias to set
	 */
	public void setDias(String dias) {
		Dias = dias;
	}
	/**
	 * @return the tipoComida
	 */
	@ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "ComidaID")
	public TipoComida getTipoComida() {
		return TipoComida;
	}
	/**
	 * @param tipoComida the tipoComida to set
	 */
	public void setTipoComida(TipoComida tipoComida) {
		TipoComida = tipoComida;
	}
	/**
	 * @return the menus
	 */
	@OneToMany(mappedBy = "comida", cascade = CascadeType.ALL)
	public List<Menu> getMenus() {
		return menus;
	}
	/**
	 * @param menus the menus to set
	 */
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	} 
	
	
	
}
