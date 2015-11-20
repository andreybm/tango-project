package com.tango.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "platillo")
public class Platillo {
	
	private Long platilloId;
	private String nombre;
	private String descripcion;
	private String diasDisponibles;
	
	public Platillo(){
		
		super();
	}

	/**
	 * @return the platilloId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "platillo_id", unique = true, nullable = false)
	public Long getPlatilloId() {
		return platilloId;
	}

	/**
	 * @param platilloId the platilloId to set
	 */
	public void setPlatilloId(Long platilloId) {
		this.platilloId = platilloId;
	}

	/**
	 * @return the nombre
	 */
	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	@Column(name = "descripcion", length = 50)
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the diasDisponibles
	 */
	@Column(name = "dias_disponibles", length = 50)
	public String getDiasDisponibles() {
		return diasDisponibles;
	}

	/**
	 * @param diasDisponibles the diasDisponibles to set
	 */
	public void setDiasDisponibles(String diasDisponibles) {
		this.diasDisponibles = diasDisponibles;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((diasDisponibles == null) ? 0 : diasDisponibles.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((platilloId == null) ? 0 : platilloId.hashCode());
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
		Platillo other = (Platillo) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (diasDisponibles == null) {
			if (other.diasDisponibles != null)
				return false;
		} else if (!diasDisponibles.equals(other.diasDisponibles))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (platilloId == null) {
			if (other.platilloId != null)
				return false;
		} else if (!platilloId.equals(other.platilloId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Platillo [platilloId=" + platilloId + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", diasDisponibles=" + diasDisponibles + "]";
	}
	
	
	

}
