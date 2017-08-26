package SheJiMoShiNaDianShi.Factory;

import SheJiMoShiNaDianShi.Factory.itf.ISwordFactory;
import SheJiMoShiNaDianShi.Factory.model.AbstractSword;
import SheJiMoShiNaDianShi.Factory.model.object.QiXingSword;

/**
 * Created by hjw on 16/8/28.
 * Caocao具体工厂-生产七星宝刀的工厂
 */
public class Caocao implements ISwordFactory {

    @Override
    public AbstractSword creatSword() {
        return new QiXingSword();
    }
}
