package SheJiMoShiNaDianShi.Builder;

import SheJiMoShiNaDianShi.Builder.director.MobileDirector;
import SheJiMoShiNaDianShi.Builder.itf.MobileBuilderImpl1;
import SheJiMoShiNaDianShi.Builder.itf.MobileBuilderImpl2;
import SheJiMoShiNaDianShi.Builder.model.MobilePackage;

/**
 * Created by hjw on 16/8/30.
 */
public class MainApp {
    public static void main(String[] args) {
        MobileDirector mobileDirector = new MobileDirector();
        //  套餐1
        MobileBuilderImpl1 mobileBuilderImpl1 = new MobileBuilderImpl1();
        MobileBuilderImpl2 mobileBuilderImpl2 = new MobileBuilderImpl2();

        printMessage(mobileDirector.creatMobilePackage(mobileBuilderImpl1));
        printMessage(mobileDirector.creatMobilePackage(mobileBuilderImpl2));
        System.out.println(mobileBuilderImpl1.getMobilePackage().getMoney());
    }

    public  static  void printMessage(MobilePackage mobilePackage){
        System.out.println("--话费:"+mobilePackage.getMoney() + "\t+短信:"+mobilePackage.getShortInfo()
        +"\t彩信:"+mobilePackage.getMusic());
    }

}
