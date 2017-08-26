package SheJiMoShiNaDianShi.Decorator;

import SheJiMoShiNaDianShi.Decorator.IBread.IBread;

/**
 * Created by hjw on 16/9/3.
 */
public class SweetDecorator extends  AbstractBread {

    public SweetDecorator(IBread bread) {
        super(bread);
    }

    public  void paint(){
        System.out.println("添加甜蜜素");
    }

    @Override
    public void kneadlFour() {
        this.paint();
        super.kneadlFour();
    }
}
