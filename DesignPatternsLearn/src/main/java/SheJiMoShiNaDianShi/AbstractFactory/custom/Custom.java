package SheJiMoShiNaDianShi.AbstractFactory.custom;

import SheJiMoShiNaDianShi.AbstractFactory.itf.IKfcFactory;
import SheJiMoShiNaDianShi.AbstractFactory.model.ChickenWings;
import SheJiMoShiNaDianShi.AbstractFactory.model.Hamburg;

/**
 * Created by hjw on 16/8/28.
 * 客户类-通过工厂暴露的方法实现具体对象的创建
 */
public class Custom {
    IKfcFactory iKfcFactory;

    public Custom(IKfcFactory iKfcFactory) {
        this.iKfcFactory = iKfcFactory;
    }

    public float orderHamburg(String kind, float price, int num){
        Hamburg hamburg =  iKfcFactory.creatHamburg(kind, price, num);
        hamburg.printMessage();
        return hamburg.totalPrice();
    }

    public float orderChickenWings(String kind, float price, int num){
        ChickenWings chickenWings = iKfcFactory.creatChichenWings(kind, price, num);
        chickenWings.printMessage();
        return chickenWings.totalPrice();
    }
}
