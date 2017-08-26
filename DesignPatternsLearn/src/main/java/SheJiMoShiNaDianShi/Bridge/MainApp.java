package SheJiMoShiNaDianShi.Bridge;

import SheJiMoShiNaDianShi.Bridge.Light.CrystalLight;
import SheJiMoShiNaDianShi.Bridge.Light.ILight;
import SheJiMoShiNaDianShi.Bridge.Light.IncandecentLight;
import SheJiMoShiNaDianShi.Bridge.Switchs.BaseSwitch;
import SheJiMoShiNaDianShi.Bridge.Switchs.RemoteControlSwitch;

/**
 * Created by hjw on 16/9/2.
 */
public class MainApp {
    public static void main(String[] args) {


        //白炽灯实例
        ILight incandecentLight = new IncandecentLight();

        //水晶灯实例
        ILight  crystalLight = new CrystalLight();

        //一般开关
        System.out.println("--------一般开关-------");

        BaseSwitch baseSwitch = new BaseSwitch(incandecentLight);
        baseSwitch.makeLightMethod();

        System.out.println("---------------");

        baseSwitch.setiLight(crystalLight);
        baseSwitch.makeLightMethod();

        System.out.println("--------遥控开关-------");

        RemoteControlSwitch remoteControlSwitch = new RemoteControlSwitch(incandecentLight);
        remoteControlSwitch.makeRemoteLightMethod(1);

        System.out.println("---------------");
        remoteControlSwitch.setiLight(crystalLight);
        remoteControlSwitch.makeRemoteLightMethod(2);



    }
}
