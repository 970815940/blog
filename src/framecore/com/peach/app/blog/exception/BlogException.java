/*
 * Blog123Exception.java  Mar 18, 2014 4:51:34 PM
 * 
 *
 * Copyright  2014 peach taoxs, Inc. All rights reserved.
 * Sysway PROPRIETARY/CONFIDENTIAL. Use is subject to licese terms.
 * http://www.123blog.cn
 *
 * Contributors：
 *  
 */
package com.peach.app.blog.exception;
/**
 *blog123系统 异常父类。创建异常时必须要指定message
 *@author  taoxs
 *@version Revision 1.0
 *@since   blog 1.0
 */
public class BlogException extends RuntimeException {

	public BlogException(String message){
		super(message);
	}
	public BlogException(String message,Exception ex){
		super(message,ex);
	}	
	@Override
	public synchronized Throwable fillInStackTrace() {
		// TODO Auto-generated method stub
		return super.fillInStackTrace();
	}

	@Override
	public String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return super.getLocalizedMessage();
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
