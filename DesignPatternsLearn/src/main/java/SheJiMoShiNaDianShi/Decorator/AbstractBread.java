package SheJiMoShiNaDianShi.Decorator;

import SheJiMoShiNaDianShi.Decorator.IBread.IBread;

/**
 * Created by hjw on 16/9/3.
 * <p>
 * 抽象装饰者
 */
public abstract class AbstractBread implements IBread {

    //存储传入的IBread对象
    private final IBread bread;


    protected AbstractBread(IBread bread) {
        this.bread = bread;
    }

    @Override
    public void prepair() {
        this.bread.prepair();
    }

    @Override
    public void kneadlFour() {
        this.bread.kneadlFour();
    }

    @Override
    public void steam() {
        this.bread.steam();
    }

    @Override
    public void process() {
        prepair();
        kneadlFour();
        steam();
    }
}
