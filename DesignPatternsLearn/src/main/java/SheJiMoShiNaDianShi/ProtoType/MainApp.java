package SheJiMoShiNaDianShi.ProtoType;

import SheJiMoShiNaDianShi.ProtoType.factory.ILifeFactory;
import SheJiMoShiNaDianShi.ProtoType.factory.impl.LifeFactoryImpl;
import SheJiMoShiNaDianShi.ProtoType.pojo.DayLife;

/**
 * Created by hjw on 16/8/31.
 */
public class MainApp {
    public static void main(String[] args) {

        //创建工厂
        ILifeFactory lifeFactory = new LifeFactoryImpl();

        //打印DayLife信息,默认内容
        DayLife daylife1 = lifeFactory.getNewInstance();
        daylife1.print();

        //再次获得DayLife,修改getUp内容
        System.out.println("-------------------");
        DayLife daylife2 = lifeFactory.getNewInstance();
        daylife2.setGetUp("早上赖床了! 7:30才起床 !");
        daylife2.print();

        //验证clone的作用,是重新建立一份内存
        System.out.println("-------------------");
        System.out.println("daylife1: " + daylife1);
        System.out.println("daylife2: " + daylife2);

    }
}
