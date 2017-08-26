package SheJiMoShiNaDianShi.Bridge.Switchs;

import SheJiMoShiNaDianShi.Bridge.Light.ILight;

/**
 * Created by hjw on 16/9/1.
 *
 *
 * 一般的开关
 */
public class BaseSwitch {

    //使用组合,将ILight作为内部私有属性,此为桥梁
    protected ILight iLight;

    public BaseSwitch(ILight iLight) {
        this.iLight = iLight;
    }

    public void setiLight(ILight iLight) {
        this.iLight = iLight;
    }

    /**
     *
     * 开灯方法
     *
     */

    public final void makeLightMethod(){
        //接通电源
        this.iLight.electricConnectoion();
        //照明
        this.iLight.light();
        //关闭开关
        this.iLight.electricClose();
    }
}

