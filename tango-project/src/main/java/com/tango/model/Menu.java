/**
 * 
 */
package com.tango.model;

/**
 * @author Esteban Enoc
 *
 */


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import org.appfuse.model.BaseObject;

// TODO: Auto-generated Javadoc
/**
 * The Class Menu.
 */
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
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1110635914541765538L;
	
	/** The Menu id. */
	private Long MenuID;
	
	/** The Empleado. */
	private Empleado Empleado;
	
	/** The Comida. */
	private Comida Comida;
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Menu [MenuID=" + MenuID + ", Empleado=" + Empleado + ", Comida=" + Comida + "]";
	}
	
	
	/**
	 * Gets the menu id.
	 *
	 * @return the menuID
	 */
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getMenuID() {
		return MenuID;
	}
	
	/**
	 * Sets the menu id.
	 *
	 * @param menuID the menuID to set
	 */
	public void setMenuID(Long menuID) {
		MenuID = menuID;
	}
	
	/**
	 * Gets the empleado.
	 *
	 * @return the empleado
	 */
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "EmpleadoID")
	public Empleado getEmpleado() {
		return Empleado;
	}
	
	/**
	 * Sets the empleado.
	 *
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(Empleado empleado) {
		Empleado = empleado;
	}
	
	/**
	 * Gets the comida.
	 *
	 * @return the comida
	 */
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "ComidaID")
	public Comida getComida() {
		return Comida;
	}
	
	/**
	 * Sets the comida.
	 *
	 * @param comida the comida to set
	 */
	public void setComida(Comida comida) {
		Comida = comida;
	}

	
	
}
