package SheJiMoShiNaDianShi.Bridge.Light;

/**
 * Created by hjw on 16/9/1.
 *
 *
 * 电灯的抽象接口
 *
 */

public interface ILight {

    //通电
    public void electricConnectoion();
    //照明
    public void light();
    //断开电流
    public void electricClose();
}

