package SheJiMoShiNaDianShi.Builder.base;

import SheJiMoShiNaDianShi.Builder.model.MobilePackage;

/**
 * Created by hjw on 16/8/30.
 * 抽象构造者
 */
public abstract class AbstractBasePackage {
    protected MobilePackage mobilePackage;

    public  AbstractBasePackage() {
         this.mobilePackage = new MobilePackage();
    }
}
