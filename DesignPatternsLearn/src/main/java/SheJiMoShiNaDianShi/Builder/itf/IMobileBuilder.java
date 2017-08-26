package SheJiMoShiNaDianShi.Builder.itf;

import SheJiMoShiNaDianShi.Builder.model.MobilePackage;

/**
 * Created by hjw on 16/8/30.
 * 抽象构建者接口
 */
public interface IMobileBuilder {

    //构建手机套餐的话费
    public void buildMoney();

    //构建手机套餐的短信
    public void buildShortInfo();

    //构建手机套餐的彩信
    public void buildMusic();

    //返回构建的手机套餐对象
    public MobilePackage getMobilePackage();

}
