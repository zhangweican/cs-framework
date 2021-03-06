package com.leweiyou.framework.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.leweiyou.framework.entity.ValidErrorEntity;
import com.leweiyou.framework.service.ServiceException;

/**
 * 环境变量的获取
 * @author Zhangweican
 *
 */
public class CXT {
	/**
	 * 获取Request
	 * @return
	 */
	public static HttpServletRequest getRequest(){
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();  
	}
	
	/**
	 * 获取Response
	 * @return
	 */
	public static HttpServletResponse getResponse() {
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
	}
	
	/**
	 * 获取存校验失败信息的ValidErrorEntity(已经存入回话中，无需再存)
	 * @return
	 */
	public static synchronized ValidErrorEntity getValidErrorMap(){
		ValidErrorEntity e = (ValidErrorEntity) getRequest().getAttribute(Commons.Key_Valid_Error_Map);
		if(e == null){
			e = new ValidErrorEntity();
		}
		getRequest().setAttribute(Commons.Key_Valid_Error_Map, e);
		return e;
	}
	
	/**
	 * 获取Spring的应用上下文
	 * @return
	 */
	public static ApplicationContext getApplicationContext(){
		return SpringContextUtil.getApplicationContext();
	}
	
	/**
	 * 通过id获取Bean
	 * @param id
	 * @return
	 */
	public static <T> T getBean(String id){
		return (T) getApplicationContext().getBean(id);
	}
	
	/**
	 * 通过Class获取Bean
	 * @param id
	 * @return
	 */
	public static <T> T getBean(Class<?> clazz){
		return (T) getApplicationContext().getBean(clazz);
	}
}
