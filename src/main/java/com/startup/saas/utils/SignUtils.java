package com.startup.saas.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class SignUtils {

    //十六进制下数字到字符的映射数组  
    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};   
      
    /**  
     * 转换字节数组为十六进制字符串 
     * @param     字节数组 
     * @return    十六进制字符串 
     */  
    private static String byteArrayToHexString(byte[] b){  
        StringBuffer resultSb = new StringBuffer();  
        for (int i = 0; i < b.length; i++){  
            resultSb.append(byteToHexString(b[i]));  
        }  
        return resultSb.toString();  
    }  
      
    /** 将一个字节转化成十六进制形式的字符串     */  
    private static String byteToHexString(byte b){  
        int n = b;  
        if (n < 0)  
            n = 256 + n;  
        int d1 = n / 16;  
        int d2 = n % 16;  
        return hexDigits[d1] + hexDigits[d2];  
    }  
	
    /**
     * 请求参数签名
     * @param appKey
     * @param param
     */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String sign(String appKey, Map<String, Object> param) {
		try {
			Comparator comparator = Collator.getInstance(java.util.Locale.CHINA);
			String[] arrStrings = new String[param.size()];
			param.keySet().toArray(arrStrings);
			Arrays.sort(arrStrings, comparator);
			StringBuffer sb = new StringBuffer();
			sb.append(appKey);
			for (int i = 0; i < arrStrings.length; i++) {			
				sb.append(arrStrings[i]+param.get(arrStrings[i]));
			}
	        //创建具有指定算法名称的信息摘要  
	        MessageDigest md = MessageDigest.getInstance("MD5");
	        //使用指定的字节数组对摘要进行最后更新，然后完成摘要计算  
	        byte[] results = md.digest(sb.toString().getBytes());  
	        //将得到的字节数组变成字符串返回  
	        String resultString = byteArrayToHexString(results);  
			return resultString.toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}  
	}

}
