package cn.com.zyTest;

import cn.com.zyTest.constant.HashConstant;
import cn.com.zyTest.entity.Chest;
import cn.com.zyTest.utils.HashCodeUtil;
/**
 * 打开宝箱
 */
public class OpenChest {

    public static void main(String[] args){
        Chest chest = new Chest();
        chest.setCode(1);
        openChest(chest);
    }

    public static void   openChest(Chest chest){
        int secretNumber = 1 ;
        while (true){
            String hashCode = HashCodeUtil.getHashCode(chest.getCode()+chest.getLastHashCode()+secretNumber);
            if(hashCode.startsWith(HashConstant.OPEN_CHEST)){
                System.out.println("chestCode:"+chest.getCode()+"chestHashCode:"+hashCode+"secretNumber:"+secretNumber);
                chest.setCode(chest.getCode()+1);
                chest.setLastHashCode(hashCode);
                break;
            }
            secretNumber ++;
        }
        if(chest.getCode()<=10){
            openChest(chest);
        }
    }
}
