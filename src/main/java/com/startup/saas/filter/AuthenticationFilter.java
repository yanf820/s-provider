package com.startup.saas.filter;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.startup.saas.api.model.ErrorSchema;

public class AuthenticationFilter implements Filter {

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

		HttpServletRequest request = (HttpServletRequest) RpcContext.getContext().getRequest();
		HttpServletResponse response = (HttpServletResponse) RpcContext.getContext().getResponse();
		String xLaAuthorization = request.getHeader("x-la-authorization");
		String xLaAppKey = request.getHeader("x-la-app-key");
		String xLaSignMethod = request.getHeader("x-la-sign-method");
		String sign = request.getParameter("sign");
		//权限认证
		if(xLaAuthorization!=null&&!xLaAuthorization.equals("")&&xLaAppKey!=null&&!xLaAppKey.equals("")){
			//oauth认证成功
			System.out.println("oauth认证成功");
			if(xLaSignMethod!=null&&xLaSignMethod.equals("MD5")&&sign!=null&&!sign.equals("")){
				//签名认证成功
				System.out.println("签名认证成功");
				return invoker.invoke(invocation);
			} else {
				ErrorSchema error = new ErrorSchema();
				error.setErrorCode(400d);
				error.setMessage("签名不正确");
				error.setTimestamp(Double.valueOf(System.currentTimeMillis()));
				print(error, response);
				return new RpcResult();
			}
		} else {
			ErrorSchema error = new ErrorSchema();
			error.setErrorCode(401d);
			error.setMessage("OAuth权限不正确");
			error.setTimestamp(Double.valueOf(System.currentTimeMillis()));
			print(error, response);
			return new RpcResult();
		}
	}

	// response返回结果信息
	protected void print(ErrorSchema error, HttpServletResponse response) {
		PrintWriter writer = null;
		try {
			response.setContentType("text/html; charset=utf-8");
			response.setContentType("Content-Type; application/json");
			writer = response.getWriter();
			ObjectMapper mapper = new ObjectMapper();
			writer.print(mapper.writeValueAsString(error));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}
}