package SheJiMoShiNaDianShi.Factory;

import SheJiMoShiNaDianShi.Factory.itf.ISwordFactory;
import SheJiMoShiNaDianShi.Factory.model.AbstractSword;

/**
 * Created by hjw on 16/8/28.
 */
public class MainApp {
    public static void main(String[] args) {
        ISwordFactory iSwordFactory  = new Caocao();
        AbstractSword abstractSword = iSwordFactory.creatSword();
        System.out.println(abstractSword.getName());

        iSwordFactory = new Caocao2();
        abstractSword = iSwordFactory.creatSword();
        System.out.println(abstractSword.getName());
    }
}
