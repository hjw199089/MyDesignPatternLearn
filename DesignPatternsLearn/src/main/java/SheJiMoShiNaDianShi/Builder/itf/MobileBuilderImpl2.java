package SheJiMoShiNaDianShi.Builder.itf;

import SheJiMoShiNaDianShi.Builder.base.AbstractBasePackage;
import SheJiMoShiNaDianShi.Builder.model.MobilePackage;

/**
 * Created by hjw on 16/8/30.
 * 40圆200条短信
 */
public class MobileBuilderImpl2 extends AbstractBasePackage implements  IMobileBuilder {
    @Override
    public void buildMoney() {
      this.mobilePackage.setMoney(40.0f);
    }

    @Override
    public void buildShortInfo() {
      this.mobilePackage.setShortInfo(200);
    }

    @Override
    public void buildMusic() {
        this.mobilePackage.setMusic("大海");

    }

    @Override
    public MobilePackage getMobilePackage() {
        return this.mobilePackage;
    }
}
