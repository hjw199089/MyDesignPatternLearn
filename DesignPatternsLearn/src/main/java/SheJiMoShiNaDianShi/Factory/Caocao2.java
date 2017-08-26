package SheJiMoShiNaDianShi.Factory;

import SheJiMoShiNaDianShi.Factory.itf.ISwordFactory;
import SheJiMoShiNaDianShi.Factory.model.AbstractSword;
import SheJiMoShiNaDianShi.Factory.model.object.BaXingSword;

/**
 * Created by hjw on 16/8/28.
 */
public class Caocao2 implements ISwordFactory {
    @Override
    public AbstractSword creatSword() {
        return new BaXingSword();
    }
}
