package SheJiMoShiNaDianShi.AbstractFactory.itf;

import SheJiMoShiNaDianShi.AbstractFactory.model.ChickenWings;
import SheJiMoShiNaDianShi.AbstractFactory.model.Hamburg;

/**
 * Created by hjw on 16/8/28.
 * 抽象工厂接口
 */
public interface IKfcFactory {
    public Hamburg creatHamburg(String kind,float price,int num);
    public ChickenWings creatChichenWings(String kind,float price,int num);
}
