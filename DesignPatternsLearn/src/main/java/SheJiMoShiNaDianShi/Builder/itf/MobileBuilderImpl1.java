package SheJiMoShiNaDianShi.Builder.itf;

import SheJiMoShiNaDianShi.Builder.base.AbstractBasePackage;
import SheJiMoShiNaDianShi.Builder.model.MobilePackage;

/**
 * Created by hjw on 16/8/30.
 * 20圆400条短信
 */
public class MobileBuilderImpl1 extends AbstractBasePackage implements  IMobileBuilder {
    @Override
    public void buildMoney() {
      this.mobilePackage.setMoney(20.0f);
    }

    @Override
    public void buildShortInfo() {
      this.mobilePackage.setShortInfo(400);
    }

    @Override
    public void buildMusic() {
        this.mobilePackage.setMusic("天使");

    }

    @Override
    public MobilePackage getMobilePackage() {
        return this.mobilePackage;
    }
}
