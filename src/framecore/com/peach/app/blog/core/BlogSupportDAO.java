/*
 * BlogSupportDAO.java  Mar 18, 2014 4:48:35 PM
 * 
 *
 * Copyright  2014 peach taoxs, Inc. All rights reserved.
 * Sysway PROPRIETARY/CONFIDENTIAL. Use is subject to licese terms.
 * http://www.123blog.cn
 *
 * Contributors：
 *  
 */
package com.peach.app.blog.core;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.peach.app.blog.DaoException.BlogDaoException;

/**
 *
 *@author  taoxs
 *@version Revision 1.0
 *@since   blog 1.0
 */
public class BlogSupportDAO extends HibernateDaoSupport implements Blog123DAO {

	public void delete(Object obj) {
		try {
			getHibernateTemplate().delete(obj);
		} catch (Exception e) {
			throw new BlogDaoException(this.getClass()+"delete执行失败！",e);
		}
	}

	public Object findById(Class clazz, Serializable id) {
		try {
			return getHibernateTemplate().get(clazz, id);
		} catch (Exception e) {
			throw new BlogDaoException(this.getClass()+"findById("+clazz+","+id+")执行失败！",e);
		}
	}

	public void save(Object obj) {
		try {
			getHibernateTemplate().save(obj);
		} catch (Exception e) {
			throw new BlogDaoException(this.getClass()+"save("+obj+")执行失败",e);
		}
		
	}

	public void saveOrUpdate(Object obj) {
		try {
			getHibernateTemplate().saveOrUpdate(obj);
		} catch (Exception e) {
			throw new BlogDaoException(this.getClass()+"saveOrUpdate("+obj+")执行失败",e);
		}		
		
	}

	public void update(Object obj) {
		try {
			getHibernateTemplate().update(obj);
		} catch (Exception e) {
			throw new BlogDaoException(this.getClass()+"update("+obj+")执行失败",e);
		}
	}

	public int countByHql(String hql, String[] params, String[] values) {
		try {
			
		} catch (Exception e) {
			throw new BlogDaoException(this.getClass()+"update("+hql+")执行失败",e);
		}
		return 0;
	}

	public List findByHql(final String hql,final  String[] params,final  String[] values,
			final int start, final int size) {
		try {
			return getHibernateTemplate().executeFind(new HibernateCallback(){

				public Object doInHibernate(Session session)
						throws HibernateException, SQLException{
					Query query=session.createQuery(hql);
					if(start>0&&size>0){
						query.setMaxResults(size);
						query.setFirstResult(start);
					}
					return query.list();
				}
			});
		} catch (Exception e) {
			throw new BlogDaoException(this.getClass()+"findByHql("+hql+","+params+","+values+","+start+","+size+")执行失败",e);
		}
	}
	

}
