package SheJiMoShiNaDianShi.Decorator;

import SheJiMoShiNaDianShi.Decorator.IBread.IBread;

/**
 * Created by hjw on 16/9/3.
 */
public class NormalBread implements IBread {

    @Override
    public void prepair() {
        System.out.println("准备材料");
    }

    @Override
    public void kneadlFour() {
        System.out.println("和面");

    }

    @Override
    public void steam() {
        System.out.println("蒸馒头");
    }

    @Override
    public void process() {
        prepair();
        kneadlFour();
        steam();
    }
}
