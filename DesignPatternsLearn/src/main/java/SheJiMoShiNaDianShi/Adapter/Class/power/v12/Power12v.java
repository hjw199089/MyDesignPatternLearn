package SheJiMoShiNaDianShi.Adapter.Class.power.v12;

import SheJiMoShiNaDianShi.Adapter.Class.power.AbsBasePower;

/**
 * Created by hjw on 16/9/1.
 */
public class Power12v extends AbsBasePower implements  IPower12v {

    public Power12v() {
        super(12);
    }

    @Override
    public void outPrint() {
        System.out.println("这是---"+ this.getPower() + this.getUnit() + "---电源");
    }

}
