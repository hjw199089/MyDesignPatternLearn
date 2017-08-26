package SheJiMoShiNaDianShi.ProtoType.factory;

import SheJiMoShiNaDianShi.ProtoType.pojo.DayLife;

/**
 * Created by hjw on 16/8/31.
 *
 * 创建原型对象的抽象工厂
 */
public interface ILifeFactory {

    /**
     *
     * 生产DayLife
     *
     * @return
     *
     */
    public DayLife getNewInstance();

}
