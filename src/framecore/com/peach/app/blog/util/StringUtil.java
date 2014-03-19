/*
 * StringUtil.java  Mar 18, 2014 3:59:42 PM
 * 
 *
 * Copyright  2014 peach taoxs, Inc. All rights reserved.
 * Sysway PROPRIETARY/CONFIDENTIAL. Use is subject to licese terms.
 * http://www.123blog.cn
 *
 * Contributors：
 *  
 */
package com.peach.app.blog.util;
/**
 *
 *@author  taoxs
 *@version Revision 1.0
 *@since   blog 1.0
 */
public class StringUtil {
	/**
	 * 获取字符串为NULL或者为“&nbsp;” ，<code>return false</code>表示该字符串为非空。
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		boolean boo=false;
		if(str==null||"".equals(str)){
			boo= true;
		}
		return boo;
	}
}
