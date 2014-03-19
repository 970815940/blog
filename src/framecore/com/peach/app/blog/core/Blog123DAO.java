/*
 * Blog123DAO.java  Mar 18, 2014 4:34:15 PM
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

import java.util.List;

/**
 *顶级DAO接口
 *@author  taoxs
 *@version Revision 1.0
 *@since   blog 1.0
 */
public interface Blog123DAO{
	/**
	 * 持久化一个对象
	 * @param obj
	 */
	public void save(Object obj);
	/**
	 * 删除一个持久化对象
	 * @param obj
	 */
	public void delete(Object obj);
	/**
	 * 修改一个持久化对象
	 * @param obj
	 */
	public void update(Object obj);
	/**
	 * 修改或者保存一个对象
	 * @param obj
	 */
	public void saveOrUpdate(Object obj);
	/**
	 * 指定实体类。实体主键。获取一个实体对象
	 * @param clazz
	 * @param id
	 * @return
	 */
	public Object findById(Class clazz,java.io.Serializable id);
	/**
	 * HQL获取列表
	 * @param hql
	 * @param params
	 * @param values
	 * @return
	 */
	public List findByHql(String hql,String[] params,String[] values,int start,int size);
	/**
	 * 获取统计数据
	 * @param hql
	 * @param params
	 * @param values
	 * @return
	 */
	public int countByHql(String hql,String[] params,String[] values);
}
