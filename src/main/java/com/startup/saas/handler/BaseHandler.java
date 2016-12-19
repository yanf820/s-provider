package com.startup.saas.handler;

public interface BaseHandler {
	
	/**
	 * 业务数据映射
	 * @param callback 
	 * @return
	 */
	public abstract BaseHandler Business(Callback callback);
	
	/**
	 * 属性值选择器
	 * @return
	 */
	public abstract BaseHandler fieldSelectors(Class voClass, String fieldSelectors);
	
	/**
	 * 属性值选择器
	 * @return
	 */
	public abstract <T> T response(Class<T> responseClazz, Class voClass);
	
}
