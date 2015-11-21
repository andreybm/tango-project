package com.tango.model;

import org.appfuse.model.BaseObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement; 

@XmlRootElement
@Entity(name="empleado")
public class Empleado extends BaseObject {
	private static final long serialVersionUID = 4253758174925598379L;
	private Long EmpleadoID;
	private String Nombre;
	private String Departamento;
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Empleado [EmpleadoID=" + EmpleadoID + ", Nombre=" + Nombre + ", Departamento=" + Departamento + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Departamento == null) ? 0 : Departamento.hashCode());
		result = prime * result + ((EmpleadoID == null) ? 0 : EmpleadoID.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
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
		Empleado other = (Empleado) obj;
		if (Departamento == null) {
			if (other.Departamento != null)
				return false;
		} else if (!Departamento.equals(other.Departamento))
			return false;
		if (EmpleadoID == null) {
			if (other.EmpleadoID != null)
				return false;
		} else if (!EmpleadoID.equals(other.EmpleadoID))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}
	/**
	 * @return the empleadoID
	 */
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
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
	 * @return the nombre
	 */
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
	 * @return the departamento
	 */
	public String getDepartamento() {
		return Departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	
	
}
