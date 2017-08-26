package SheJiMoShiNaDianShi.Facade;

/**
 * Created by hjw on 16/9/3.
 */
public class Spareribs implements ISpareribs {

    @Override
    public void prepair() {
        System.out.println("准备材料");
    }

    @Override
    public void preseve() {
        System.out.println("腌制排骨");
    }

    @Override
    public void fry() {
        System.out.println("炸排骨");
    }

    @Override
    public void juice() {
        System.out.println("调汁");

    }
}
