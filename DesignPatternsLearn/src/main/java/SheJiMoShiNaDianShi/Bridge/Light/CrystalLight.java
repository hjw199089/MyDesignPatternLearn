package SheJiMoShiNaDianShi.Bridge.Light;

/**
 * Created by hjw on 16/9/2.
 *
 * 水晶灯
 */
public class CrystalLight implements ILight {

    @Override
    public void electricConnectoion() {
        System.out.println("水晶灯开通");
    }

    @Override
    public void light() {
        System.out.println("水晶灯照明");
    }

    @Override
    public void electricClose() {
        System.out.println("水晶灯关闭");
    }
}
