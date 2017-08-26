package SheJiMoShiNaDianShi.AbstractFactory.model.kfc;

import SheJiMoShiNaDianShi.AbstractFactory.model.ChickenWings;

/**
 * Created by hjw on 16/8/28.
 * 鸡翅实现类
 */
public class ChinaChickenWings extends ChickenWings {
    /**
     * 构造函数
     * @param kind
     * @param price
     * @param num
     */
    public ChinaChickenWings(String kind,float price,int num) {
        this.kind = kind;
        this.price = price;
        this.num = num;
    }

}
