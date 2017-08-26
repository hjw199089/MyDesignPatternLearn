package SheJiMoShiNaDianShi.Adapter.Object;

import SheJiMoShiNaDianShi.Adapter.Class.power.AbsBasePower;
import SheJiMoShiNaDianShi.Adapter.Class.power.v12.IPower12v;

/**
 * Created by hjw on 16/9/1.
 */
public class AdapterPower12v implements IPower12v {

    private final AbsBasePower absBasePower;

    public AdapterPower12v(AbsBasePower absBasePower) {
        this.absBasePower = absBasePower;
    }

    @Override
    public void outPrint() {
        float power = absBasePower.getPower();
        if(power == 380){
            power /= 31.67f;
        }else if(power == 220){
            power /= 18.33f;
        }else{
            System.out.println("不能适配!!!!");
            return;
        }

        System.out.println("适配结果---"+power + absBasePower.getUnit()+"--电源!!!");
    }
}
