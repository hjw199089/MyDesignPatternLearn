package SheJiMoShiNaDianShi.Decorator;

import SheJiMoShiNaDianShi.Decorator.IBread.IBread;

/**
 * Created by hjw on 16/9/3.
 *
 * 创建染色剂装饰着
 *
 * 染色的玉米馒头
 */
public class CornDecorator extends AbstractBread{

    public CornDecorator(IBread bread) {
        super(bread);
    }

    //黑心商贩开始染色
    public void paint(){
        System.out.println("添加着色剂");
    }

    @Override
    public void kneadlFour() {
        this.paint();
        super.kneadlFour();
    }
}
