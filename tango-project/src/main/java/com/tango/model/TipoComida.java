/**
 * 
 */
package com.tango.model;

import org.appfuse.model.BaseObject;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.ArrayList;

/*import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;*/

/**
 * @author Esteban Enoc
 *
 */
@XmlRootElement
@Entity(name="tipocomida")
public class TipoComida extends BaseObject {
	
	private static final long serialVersionUID = 1106630883938632257L;
	private Long TipoComidaID;
    private String Descripcion;
    private List<Comida> Comidas = new ArrayList<Comida>();
    
    
    
	/**
	 * @return the comidas
	 */
	public List<Comida> getComidas() {
		return Comidas;
	}
	/**
	 * @param comidas the comidas to set
	 */
	public void setComidas(List<Comida> comidas) {
		Comidas = comidas;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoComida [TipoComidaID=" + TipoComidaID + ", Descripcion=" + Descripcion + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + ((TipoComidaID == null) ? 0 : TipoComidaID.hashCode());
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
		TipoComida other = (TipoComida) obj;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (TipoComidaID == null) {
			if (other.TipoComidaID != null)
				return false;
		} else if (!TipoComidaID.equals(other.TipoComidaID))
			return false;
		return true;
	}
	/**
	 * @return the tipoComidaID
	 */
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getTipoComidaID() {
		return TipoComidaID;
	}
	/**
	 * @param tipoComidaID the tipoComidaID to set
	 */
	public void setTipoComidaID(Long tipoComidaID) {
		TipoComidaID = tipoComidaID;
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
    
    
}
