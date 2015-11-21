/**
 * 
 */
package com.tango.dao.hibernate;

/**
 * @author Esteban Enoc
 *
 */

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tango.dao.TipoComidaDao;
import com.tango.model.TipoComida;

// TODO: Auto-generated Javadoc
/**
 * The Class TipoComidaDaoHibernate.
 */
@Repository("tipoComidaDao")
public class TipoComidaDaoHibernate extends GenericDaoHibernate<TipoComida, Long> implements TipoComidaDao {

	/**
	 * constructor.
	 */
    public TipoComidaDaoHibernate() {
        super(TipoComida.class);
    }

    /* (non-Javadoc)
     * @see com.tango.dao.TipoComidaDao#findByDescripcion(java.lang.String)
     */
    @Override
    public List<TipoComida> findByDescripcion(String Descripcion) {
        return getSession().createCriteria(TipoComida.class).add(Restrictions.eq("Descripcion", Descripcion)).list();
    }
 
}
