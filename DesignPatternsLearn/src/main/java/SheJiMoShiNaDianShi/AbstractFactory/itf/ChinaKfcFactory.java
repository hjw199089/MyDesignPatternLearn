package SheJiMoShiNaDianShi.AbstractFactory.itf;

import SheJiMoShiNaDianShi.AbstractFactory.model.ChickenWings;
import SheJiMoShiNaDianShi.AbstractFactory.model.Hamburg;
import SheJiMoShiNaDianShi.AbstractFactory.model.kfc.ChinaChickenWings;
import SheJiMoShiNaDianShi.AbstractFactory.model.kfc.ChinaHamburg;

/**
 * Created by hjw on 16/8/28.
 * 具体的工厂
 */
public class ChinaKfcFactory implements IKfcFactory {
    @Override
    public Hamburg creatHamburg(String kind, float price, int num) {
        return new ChinaHamburg(kind, price, num);
    }

    @Override
    public ChickenWings creatChichenWings(String kind, float price, int num) {
        return new ChinaChickenWings(kind, price, num);
    }
}
