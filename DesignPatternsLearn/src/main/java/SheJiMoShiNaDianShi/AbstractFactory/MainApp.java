package SheJiMoShiNaDianShi.AbstractFactory;

import SheJiMoShiNaDianShi.AbstractFactory.custom.Custom;
import SheJiMoShiNaDianShi.AbstractFactory.itf.ChinaKfcFactory;
import SheJiMoShiNaDianShi.AbstractFactory.itf.IKfcFactory;

/**
 * Created by hjw on 16/8/28.
 */
public class MainApp {
    public static void main(String[] args) {
        IKfcFactory iKfcFactory = new ChinaKfcFactory();

        Custom custom = new Custom(iKfcFactory);

        float hamburgMoney = custom.orderHamburg("麻辣", 1.2f, 2);
        float chichenWingsMoney = custom.orderChickenWings("奥尔良", 2, 4);
        System.out.println("总计: " + (hamburgMoney + chichenWingsMoney));
    }
}
