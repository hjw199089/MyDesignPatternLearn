package SheJiMoShiNaDianShi.Bridge.Switchs;

import SheJiMoShiNaDianShi.Bridge.Light.ILight;

/**
 * Created by hjw on 16/9/1.
 *
 *
 * 遥控开关--新功能(扩充功能),不改变其他
 *
 */
public class RemoteControlSwitch extends BaseSwitch{

    public RemoteControlSwitch(ILight iLight) {
        super(iLight);
    }

    @Override
    public void setiLight(ILight iLight) {
        super.setiLight(iLight);
    }

    /**
     *
     * 使用遥控控制开发的方法
     *
     * @param operColor
     */

    public final void makeRemoteLightMethod(int operColor){

        //打开开关,通电
        this.iLight.electricConnectoion();

        //照明
        this.iLight.light();

        String color = "";

        switch (operColor){
            case 1:color = "暖色";
                break;
            case 2:color = "冷色";
                break;
            default :
                color = "白色";
                break;
        }
        System.out.println("色调是:"+color);

        //关闭开关
        this.iLight.electricClose();
    }
}
