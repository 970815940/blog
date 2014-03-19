/*
 * DaoException.java  Mar 18, 2014 4:53:48 PM
 * 
 *
 * Copyright  2014 peach taoxs, Inc. All rights reserved.
 * Sysway PROPRIETARY/CONFIDENTIAL. Use is subject to licese terms.
 * http://www.123blog.cn
 *
 * Contributors：
 *  
 */
package com.peach.app.blog.DaoException;

import com.peach.app.blog.exception.BlogException;

/**
 *数据持久层异常类
 *@author  taoxs
 *@version Revision 1.0
 *@since   blog 1.0
 */
public class BlogDaoException extends BlogException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BlogDaoException(String message, Exception ex) {
		super(message, ex);
		// TODO Auto-generated constructor stub
	}


	public BlogDaoException(String message) {
		super(message);
	}
}
