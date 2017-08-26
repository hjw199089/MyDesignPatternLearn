package SheJiMoShiNaDianShi.AbstractFactory.model;

/**
 * Created by hjw on 16/8/28.
 * 创建不同食物的抽象类
 */
public abstract class Hamburg extends AbstractBaseFood implements  IFood{
    @Override
    public void printMessage() {
        System.out.println("----"+this.kind+"风味汉堡,\t 单价:"+this.price + ", \t数量:"+this.num+
                ", \t总计:"+this.totalPrice());
    }
}
