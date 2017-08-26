package SheJiMoShiNaDianShi.AbstractFactory.model;

/**
 * Created by hjw on 16/8/28.
 */
public abstract class ChickenWings extends AbstractBaseFood implements IFood{
    @Override
    public void printMessage() {
        System.out.println("----"+this.kind+"风味鸡翅,\t 单价:"+this.price + ", \t数量:"+this.num+
                ", \t总计:"+this.totalPrice());
    }
}

