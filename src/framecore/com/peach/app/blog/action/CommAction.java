/*
 * CommAction.java  Mar 19, 2014 11:52:20 AM
 * 
 *
 * Copyright  2014 peach taoxs, Inc. All rights reserved.
 * Sysway PROPRIETARY/CONFIDENTIAL. Use is subject to licese terms.
 * http://www.123blog.cn
 *
 * Contributors：
 *  
 */
package com.peach.app.blog.action;

import com.peach.app.web.WebAppSuport;

/**
 *
 *@author  taoxs
 *@version Revision 1.0
 *@since   blog 1.0
 */
public class CommAction extends WebAppSuport {
	/**
	 * 博客首页
	 */
	private final int home =1;
	/**
	 * 玩转技术
	 */
	private final int blog=2;
	/**
	 * 烟雨蒙蒙
	 */
	private final int blog2=3;
	/**
	 * 留言板
	 */
	private final int msg=4;
	/**
	 * 关于作者
	 */
	private final int aboutAuth=5;
	/**
	 * 帮助作者
	 */
	private final int helpAuth=6;
	/**
	 * 登陆
	 */
	private final int login=7;
	/**
	 * 注册
	 */
	private final int register=8;
	
	////////////////////////////////////
	private int open=0;
	/**
	 * 
	 */
	private static final long serialVersionUID = 9123407056414652279L;
	public String doBlog(){
		String flag=null;
		switch (open) {
			case 1:
				flag=super.SUCCESS;
				break;
			case 2:
				flag="blog";
				break;
			case 3:
				flag="blog2";
				break;
			case 4:
				flag="msg";
				break;
			case 5:
				flag="aboutAuth";
				break;
			case 6:
				flag="helpAuth";
				break;
			case 7:
				flag="login";
				break;	
			case 8:
				flag="register";
				break;				
		default:
			flag=super.INPUT;
			break;
		}
		return flag;
	}
	public void setOpen(int open) {
		this.open = open;
	}
}
