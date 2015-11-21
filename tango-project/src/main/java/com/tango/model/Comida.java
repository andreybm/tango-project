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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@XmlRootElement
@Entity(name="comida")
public class Comida {

	private static final long serialVersionUID = 4253758174925598379L;
	private Long ComidaID;
	private String Nombre;
	private String Descripcion;
	private String Dias;
	private TipoComida TipoComida; 
	private List<Menu> menus = new ArrayList<Menu>(); 
	
}
