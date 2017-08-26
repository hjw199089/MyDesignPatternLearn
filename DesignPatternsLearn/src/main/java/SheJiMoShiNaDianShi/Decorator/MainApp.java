package SheJiMoShiNaDianShi.Decorator;

import SheJiMoShiNaDianShi.Decorator.IBread.IBread;

/**
 * Created by hjw on 16/9/3.
 */
public class MainApp {
    public static void main(String[] args) {

        IBread bread = new  NormalBread();
        //bread.process();
        //着色馒头
       bread = new CornDecorator(bread);
        bread = new SweetDecorator(bread);
        bread.process();
    }
}
