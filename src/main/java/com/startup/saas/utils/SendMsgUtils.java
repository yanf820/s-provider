package com.startup.saas.utils;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SendMsgUtils {

	/**
	 * 发送手机短信
	 * @param number 手机号
	 * @param content 短信内容
	 * @return 验证码
	 * @throws JsonProcessingException 
	 */
	public static String send(String mobile, String content) throws JsonProcessingException {
		String code = createRandom(true, 4);
		Map<String, String> paramsMap = new HashMap<String, String>();
		paramsMap.put("mobiles", mobile);
		paramsMap.put("content", String.format(content, code));
		paramsMap.put("type", "1");
		paramsMap.put("scope", "1");
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(paramsMap);
		Map<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/x-www-form-urlencoded");
		HttpUtil.post("http://10.1.34.221:8231/services/mps/push", headerMap, json, "UTF-8");
		return code;
	}

	/**
	 * 创建指定数量的随机字符串
	 * 
	 * @param numberFlag 是否是数字
	 * @param length 字符串长度 
	 * @return 随机字符串
	 */
	public static String createRandom(boolean numberFlag, int length) {
		String retStr = "";
		String strTable = numberFlag ? "1234567890" : "1234567890abcdefghijkmnpqrstuvwxyz";
		int len = strTable.length();
		boolean bDone = true;
		do {
			retStr = "";
			int count = 0;
			for (int i = 0; i < length; i++) {
				double dblR = Math.random() * len;
				int intR = (int) Math.floor(dblR);
				char c = strTable.charAt(intR);
				if (('0' <= c) && (c <= '9')) {
					count++;
				}
				retStr += strTable.charAt(intR);
			}
			if (count >= 2) {
				bDone = false;
			}
		} while (bDone);
		return retStr;
	}

	public static void main(String[] args) {
		try {
			System.out.println(send("18612215610", "您的验证码是%s。有效期60秒请在页面中提交验证码完成验证。"));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
