package SheJiMoShiNaDianShi.AbstractFactory.model.kfc;

import SheJiMoShiNaDianShi.AbstractFactory.model.Hamburg;

/**
 * Created by hjw on 16/8/28.
 * 创建具体的食物
 */
public class ChinaHamburg extends Hamburg {
    /**
     * 构造函数
     * @param kind
     * @param price
     * @param num
     */
    public ChinaHamburg(String kind,float price,int num) {
        this.kind = kind;
        this.price = price;
        this.num = num;
    }
}
