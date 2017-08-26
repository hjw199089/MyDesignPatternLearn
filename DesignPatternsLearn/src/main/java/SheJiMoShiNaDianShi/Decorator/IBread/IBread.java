package SheJiMoShiNaDianShi.Decorator.IBread;

/**
 * Created by hjw on 16/9/3.
 *
 * 馒头加工接口
 */
public interface IBread {

    //准备材料
    public void prepair();

    //和面
    public void kneadlFour();

    //蒸馒头
    public void steam();

    /**
     * 加工馒头方法
     */
    public void process();

}
