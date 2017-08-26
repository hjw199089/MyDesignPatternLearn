package SheJiMoShiNaDianShi.Adapter.Object;

import SheJiMoShiNaDianShi.Adapter.Class.power.v220.Power220v;

/**
 * Created by hjw on 16/9/1.
 */
public class MainApp {
    public static void main(String[] args) {

        Power220v power220v = new Power220v();
        power220v.outPrint220v();

        AdapterPower12v adapterPower12v = new AdapterPower12v(power220v);
        adapterPower12v.outPrint();
    }
}
