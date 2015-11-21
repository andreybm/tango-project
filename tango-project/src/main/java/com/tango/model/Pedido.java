/**
 * 
 */
package com.tango.model;

import java.util.Set;

/**
 * @author Esteban Enoc
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name = "Pedido")
public class Pedido {

	private Long PedidoID;
	private Long EmpleadoID;
	private Long PlatilloID;
	
	
	/**
	 * @return the pedidoID
	 */
	public Long getPedidoID() {
		return PedidoID;
	}
	/**
	 * @param pedidoID the pedidoID to set
	 */
	public void setPedidoID(Long pedidoID) {
		PedidoID = pedidoID;
	}
	/**
	 * @return the empleadoID
	 */
	public Long getEmpleadoID() {
		return EmpleadoID;
	}
	/**
	 * @param empleadoID the empleadoID to set
	 */
	public void setEmpleadoID(Long empleadoID) {
		EmpleadoID = empleadoID;
	}
	/**
	 * @return the platilloID
	 */
	public Long getPlatilloID() {
		return PlatilloID;
	}
	/**
	 * @param platilloID the platilloID to set
	 */
	public void setPlatilloID(Long platilloID) {
		PlatilloID = platilloID;
	}
	
/**
	 * @param pedidoID
	 * @param empleadoID
	 * @param platilloID
	 */
	public Pedido(Long pedidoID, Long empleadoID, Long platilloID) {
		super();
		PedidoID = pedidoID;
		EmpleadoID = empleadoID;
		PlatilloID = platilloID;
	}

}
