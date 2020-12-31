package cn.com.zyTest.entity;

/**
 * 宝箱实体类
 */
public class Chest {

    /**
     * 宝箱编号 从1-10
     */
    private int code;

    /**
     * hash值
     */
    private String hashCode;

    /**
     * 上一个宝箱的hash值
     */
    private String lastHashCode = "0";

    /**
     * 神秘数字
     */
    private int secretNumber ;

    public int getCode() { return code; }

    public void setCode(int code) { this.code = code; }

    public String getHashCode() { return hashCode; }

    public void setHashCode(String hashCode) { this.hashCode = hashCode; }

    public String getLastHashCode() { return lastHashCode; }

    public void setLastHashCode(String lastHashCode) { this.lastHashCode = lastHashCode; }

    public int getSecretNumber() { return secretNumber; }

    public void setSecretNumber(int secretNumber) { this.secretNumber = secretNumber; }

}
