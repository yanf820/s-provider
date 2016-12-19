package com.startup.saas.handler;

import com.startup.saas.api.model.ErrorSchema;
import com.startup.saas.utils.ExtendBeanUtils;

public class DefaultHandler implements BaseHandler {
	
	private boolean isError = false;
    private int errorCode = 200;
    
	//业务数据
	private Object businessData;

	@Override
	public BaseHandler Business(Callback callback) {
		//业务数据映射
		if(!isError){
			businessData = callback.call();
		}
		return this;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public BaseHandler fieldSelectors(Class voClass, String fieldSelectors) {
		// 属性值选择
		if(!isError){			
			if(businessData!=null){
				businessData = ExtendBeanUtils.copyProperties(businessData, voClass, fieldSelectors);
			} else {
				//签名认证失败 返回错误400错误码
				isError = true;
				errorCode = 404;
			}
		}
		return this;
	}
	

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public <T> T response(Class<T> responseClazz,Class voClass) {
		try {
			ErrorSchema error = new ErrorSchema();
			error.setTimestamp(Double.valueOf(System.currentTimeMillis()));
			switch (errorCode) {
				case 200:
					return (T) responseClazz.getMethod("withJsonOK", voClass).invoke(null, businessData);				
				case 400:
					error.setErrorCode(400d);
					error.setMessage("请求格式不正确");
					return (T) responseClazz.getMethod("withJsonBadRequest",ErrorSchema.class).invoke(null, error);				
				case 401:
					error.setErrorCode(401d);
					error.setMessage("OAuth签名不正确");
					return (T) responseClazz.getMethod("withJsonUnauthorized",ErrorSchema.class).invoke(null, error);				
				case 403:
					error.setErrorCode(403d);
					error.setMessage("资源访问被拒绝");
					return (T) responseClazz.getMethod("withJsonForbidden",ErrorSchema.class).invoke(null, error);				
				case 404:
					error.setErrorCode(404d);
					error.setMessage("找不到访问资源");
					return (T) responseClazz.getMethod("withJsonNotFound",ErrorSchema.class).invoke(null, error);				
				case 405:
					error.setErrorCode(405d);
					error.setMessage("错误的http方法");
					return (T) responseClazz.getMethod("withJsonMethodNotAllowed",ErrorSchema.class).invoke(null, error);
				default:
					error.setErrorCode(500d);
					error.setMessage("服务端错误");
					return (T) responseClazz.getMethod("withJsonInternalServerError",ErrorSchema.class).invoke(null, error);
			}
		} catch (Exception e) {
			return null;
		}
	}
}
