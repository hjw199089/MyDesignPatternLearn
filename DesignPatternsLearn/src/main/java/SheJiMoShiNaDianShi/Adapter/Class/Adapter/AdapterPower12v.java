package SheJiMoShiNaDianShi.Adapter.Class.Adapter;

import SheJiMoShiNaDianShi.Adapter.Class.power.AbsBasePower;
import SheJiMoShiNaDianShi.Adapter.Class.power.v12.IPower12v;

/**
 * Created by hjw on 16/9/1.
 *
 * 继承 传入待适配对象
 */
public class AdapterPower12v extends AbsBasePower implements IPower12v {

    //
    public AdapterPower12v(AbsBasePower absBasePower) {
        super(absBasePower.getPower());
    }

    @Override
    public void outPrint() {
        float power = this.getPower();
        if(power == 380){
            power /= 31.67f;
        }else if(power == 220){
            power /= 18.33f;
        }else{
            System.out.println("不能适配!!");
            return;
        }

        System.out.println("适配结果---"+power + this.getUnit()+"--电源");
    }
}
