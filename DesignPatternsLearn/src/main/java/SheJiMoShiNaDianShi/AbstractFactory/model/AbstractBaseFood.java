package SheJiMoShiNaDianShi.AbstractFactory.model;

/**
 * Created by hjw on 16/8/28.
 * 抽象的食物对象
 */
public abstract class AbstractBaseFood {
    //类别
    protected String kind;
    //数量
    protected int num;

    //单价
    protected float price;

    //总价
    public float totalPrice() {
        return this.num * this.price;
    }
}
