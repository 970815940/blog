/*
 * BlogApplicationInitztionImpl.java  Mar 19, 2014 10:42:04 AM
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

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.peach.app.core.WebApplicationInitalzation;

/**
 *
 *@author  taoxs
 *@version Revision 1.0
 *@since   blog 1.0
 */
public class BlogApplicationInitztionImpl implements WebApplicationInitalzation {
	private static Log log = LogFactory.getLog(BlogApplicationInitztionImpl.class);
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("成功销毁应用");

	}

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext sc=sce.getServletContext();
		String path=getContextPath(sc);
		String configPath=sc.getInitParameter("blogApp-Config");
		log.warn("读取到系统配置文件路径为:["+configPath+"]");
		Map map=new HashMap();
		map.put(ApplicationGlobal.PB_CONTEXTPATH, path);
		setGlobalAttributeApp(sc, map);
	}

	public String getContextPath(ServletContext context) {
		return context.getContextPath();
	}

	public void setGlobalAttributeApp(ServletContext ServletContext,
			Map<String, Object> map) {
		if(map!=null&&map.size()>0){
			for (String ele : map.keySet()) {
				ServletContext.setAttribute(ele, map.get(ele));
			}
		}
	}


}
