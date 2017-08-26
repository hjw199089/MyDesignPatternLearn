package SheJiMoShiNaDianShi.Builder.director;

import SheJiMoShiNaDianShi.Builder.itf.IMobileBuilder;
import SheJiMoShiNaDianShi.Builder.model.MobilePackage;

/**
 * Created by hjw on 16/8/30.
 */
public class MobileDirector {
    public MobilePackage creatMobilePackage(IMobileBuilder mobileBuilder){
        if(mobileBuilder != null){
            mobileBuilder.buildMoney();
            mobileBuilder.buildShortInfo();
            mobileBuilder.buildMusic();
            return mobileBuilder.getMobilePackage();
        }else
            return null;
    }
}
