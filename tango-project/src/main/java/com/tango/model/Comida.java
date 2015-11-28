/**
 * @author Esteban Enoc
 *
 */
package com.tango.model;

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

// TODO: Auto-generated Javadoc
/**
 * The Class Comida.
 */
@XmlRootElement
@Entity(name="comida")
public class Comida extends BaseObject {

	
}
