package com.startup.saas.utils;

import com.startup.saas.api.model.Topics;
import com.startup.saas.api.resource.TopicsResource;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/12/14.
 *
 * 加密工具
 */
public class EncryptUtil {


    /**
     * md5 32位
     * @param str
     * @return
     */
    public static String encodeMD5(String str){
        try {
            byte[] bytes = MD5Hash(str.getBytes(), 0, str.length());
            return byte2hex(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * sha 加密
     * @param str
     * @return
     */
    public static String encodeSHA(String str){
        try {
            return byte2hex(SHA1(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


    /***
     * md5 hash
     * @param buf
     * @param offset
     * @param length
     * @return
     * @throws Exception
     */
    public static byte[] MD5Hash(byte[] buf, int offset, int length)
            throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(buf, offset, length);
        return md.digest();
    }

    public static byte[] encode(byte[] buf,String type) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(type);
        md.update(buf);
        return buf;
    }

    public static byte[] SHA1(byte[] buf) throws NoSuchAlgorithmException {
        return encode(buf,"SHA");
    }


    /**
     *  字节数组转换为二行制表示
     * @param inStr
     * @return
     */
    public static String byte2hex(byte[] inStr) {
        String stmp;
        StringBuffer out = new StringBuffer(inStr.length * 2);

        for (int n = 0; n < inStr.length; n++) {
            // 字节做"与"运算，去除高位置字节 11111111
            stmp = Integer.toHexString(inStr[n] & 0xFF);
            if (stmp.length() == 1) {
                // 如果是0至F的单位字符串，则添加0
                out.append("0" + stmp);
            } else {
                out.append(stmp);
            }
        }
        return out.toString();
    }


    /**
     * 用base64算法进行加密
     * @param str 需要加密的字符串
     * @return base64加密后的结果
     */
    public static String encodeBase64String(String str) {
        BASE64Encoder encoder =  new BASE64Encoder();
        return encoder.encode(str.getBytes());
    }


    /**
     * 用base64算法进行解密
     * @param str 需要解密的字符串
     * @return base64解密后的结果
     * @throws IOException
     */
    public static String decodeBase64String(String str) throws IOException {
        BASE64Decoder encoder =  new BASE64Decoder();
        return new String(encoder.decodeBuffer(str));
    }

    public static void main(String args[]){
//        System.out.println(encodeMD5("hello"));
        reflection();
    }

    public static void reflection(){
        try {
            Class<?> aClass = Class.forName("com.startup.saas.api.resource.TopicsResource$GetTopicsByFieldSelectorsResponse");
            aClass = TopicsResource.GetTopicsByFieldSelectorsResponse.class;
            Method ok = aClass.getMethod("withJsonOK",Topics.class);
            Object o = ok.invoke(null, new Topics());
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
