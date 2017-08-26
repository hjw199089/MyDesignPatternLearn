package SheJiMoShiNaDianShi.ProtoType.factory.impl;

import SheJiMoShiNaDianShi.ProtoType.factory.ILifeFactory;
import SheJiMoShiNaDianShi.ProtoType.pojo.DayLife;

/**
 * Created by hjw on 16/8/31.
 */
public class LifeFactoryImpl implements ILifeFactory {


    //静态 DayLife对象用于实例初始化
    private static DayLife dayLife = null;


    /**
     * 首先判断daylife是否为null
     * 若果是则new创建一个DayLife对象
     * 若果不是则使用daylife的clone克隆一份新对象赋值给daylife
     *
     * @return
     */

    @Override
    public DayLife getNewInstance() {

        if (dayLife == null) {
            System.out.println(" new DayLife !");
            dayLife = new DayLife("7:00 起床",
                    "7:30 坐公交",
                    "8:30 到公司附近的公交站,经过早餐车带一份早餐",
                    "午饭,小憩",
                    "13:30 下午工作",
                    "17:30 下班",
                    "晚上休闲"
            );

        } else {
            System.out.println(" clone DayLife !");
            dayLife = dayLife.colne();
        }
        return dayLife;
    }
}
