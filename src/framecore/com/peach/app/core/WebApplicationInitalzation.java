/*
 * WebApplicationInitalzation.java  Mar 19, 2014 10:34:49 AM
 * 
 *
 * Copyright  2014 peach taoxs, Inc. All rights reserved.
 * Sysway PROPRIETARY/CONFIDENTIAL. Use is subject to licese terms.
 * http://www.123blog.cn
 *
 * Contributors：
 *  
 */
package com.peach.app.core;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;





/**
 *监听APP启动成功后。调用该接口
 *@author  taoxs
 *@version Revision 1.0
 *@since   blog 1.0
 */
public interface WebApplicationInitalzation extends ServletContextListener  {
	/**
	 * 获取容器根上下文路径
	 * @param context
	 * @return
	 */
	public String getContextPath(ServletContext context);
	/**
	 * 
	 * @param ServletContext
	 * @param map
	 */
	public void setGlobalAttributeApp(ServletContext ServletContext,Map<String, Object> map);
	

}
