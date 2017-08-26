package SheJiMoShiNaDianShi.Adapter.Class.power.v220;

import SheJiMoShiNaDianShi.Adapter.Class.power.AbsBasePower;

/**
 * Created by hjw on 16/9/1.
 */
public class Power220v extends AbsBasePower implements Ipower220v {

    public Power220v() {
        super(220);
    }
    @Override
    public void outPrint220v() {
        System.out.println("这是---"+ this.getPower() + this.getUnit() + "---电源");
    }
}
