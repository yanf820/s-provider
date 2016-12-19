package com.startup.saas.utils;

import org.springframework.beans.BeanUtils;

public class ExtendBeanUtils {
	
	/**
	 * 对象间映射
	 * @param obj	source对象
	 * @param clazz target类
	 * @param fields 过滤字段
	 * @return
	 */
	public static <T> T copyProperties(Object obj, Class<T> clazz, String fields) {
		try {
			T target = clazz.newInstance();
			if(fields!=null&&!fields.equals("")){
				if(fields.startsWith(":(")&&fields.endsWith(")")){
					String []fieldArr = fields.substring(2, fields.length()-1).split(",");
					BeanUtils.copyProperties(obj, target, fieldArr);
				}
			}
			return target;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 对象间映射
	 * @param obj	source对象
	 * @param clazz target类
	 * @return
	 */
	public static <T> T copyProperties(Object obj, Class<T> clazz) {
		return copyProperties(obj, clazz, null);
	}
	
}
