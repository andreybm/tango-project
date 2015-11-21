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

import javax.persistence.Lob;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.appfuse.model.BaseObject;

@XmlRootElement
@Entity(name="menu")
public class Menu extends BaseObject {

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Comida == null) ? 0 : Comida.hashCode());
		result = prime * result + ((Empleado == null) ? 0 : Empleado.hashCode());
		result = prime * result + ((MenuID == null) ? 0 : MenuID.hashCode());
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
		Menu other = (Menu) obj;
		if (Comida == null) {
			if (other.Comida != null)
				return false;
		} else if (!Comida.equals(other.Comida))
			return false;
		if (Empleado == null) {
			if (other.Empleado != null)
				return false;
		} else if (!Empleado.equals(other.Empleado))
			return false;
		if (MenuID == null) {
			if (other.MenuID != null)
				return false;
		} else if (!MenuID.equals(other.MenuID))
			return false;
		return true;
	}
	private static final long serialVersionUID = 1110635914541765538L;
	private Long MenuID;
	private Empleado Empleado;
	private Comida Comida;
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Menu [MenuID=" + MenuID + ", Empleado=" + Empleado + ", Comida=" + Comida + "]";
	}
	
	
	/**
	 * @return the menuID
	 */
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getMenuID() {
		return MenuID;
	}
	/**
	 * @param menuID the menuID to set
	 */
	public void setMenuID(Long menuID) {
		MenuID = menuID;
	}
	/**
	 * @return the empleado
	 */
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "EmpleadoID")
	public Empleado getEmpleado() {
		return Empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(Empleado empleado) {
		Empleado = empleado;
	}
	/**
	 * @return the comida
	 */
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "ComidaID")
	public Comida getComida() {
		return Comida;
	}
	/**
	 * @param comida the comida to set
	 */
	public void setComida(Comida comida) {
		Comida = comida;
	}

	
	
}
