package cn.com.zyTest.utils;

import cn.com.zyTest.constant.HashConstant;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 计算hash工具类
 */
public class HashCodeUtil {

    /**
     * 使用java原生的SHA256实现加密
     * @param str 需进行hash计算字符串
     * @return 密文
     */
    public static String getHashCode(String str){
        MessageDigest messageDigest;
        String encodeStr = "";
        try{
            messageDigest = MessageDigest.getInstance(HashConstant.SHA256);
            messageDigest.update(str.getBytes(HashConstant.ENCODE_UTF_8));
            encodeStr = byte2Hex(messageDigest.digest());
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodeStr;
    }

    /**
     * 将byte转为16进制
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for(int i = 0 ;i<bytes.length;i++){
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到的一位的进行补0操作
                stringBuffer.append(HashConstant.ZREO);
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}
