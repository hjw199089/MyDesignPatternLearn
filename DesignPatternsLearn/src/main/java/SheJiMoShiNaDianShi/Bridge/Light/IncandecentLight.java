package SheJiMoShiNaDianShi.Bridge.Light;

/**
 * Created by hjw on 16/9/2.
 *
 *
 * 白炽灯
 */
public class IncandecentLight implements ILight {
    @Override
    public void electricConnectoion() {
        System.out.println("白炽灯开通");
    }

    @Override
    public void light() {
        System.out.println("白炽灯照明");
    }

    @Override
    public void electricClose() {
        System.out.println("白炽灯关闭");
    }
}
