/**   
* @Title: FireFrogEvent.java 
* @Package com.winterframework.firefrog.event 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 你的名字   
* @date 2013-10-28 下午4:07:44 
* @version V1.0   
*/
package com.winterframework.efamily.base.event;

import org.springframework.context.ApplicationEvent;
 
public class BaseEvent extends ApplicationEvent { 
	/**
	 * 
	 */
	private static final long serialVersionUID = -7653839371443595608L;

	/** 
	* Title:
	* Description:
	* @param source 
	*/
	public BaseEvent(Object source) {
		super(source);
	}

	
}
