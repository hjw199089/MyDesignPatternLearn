package SheJiMoShiNaDianShi.Flyweight;

/**
 * Created by hjw on 16/9/4.
 */
public class BlackChessman extends AbstractChessman {
    /**
     *
     * 构造方法,初识化黑棋子
     *
     */

    public BlackChessman() {
        super("●");
        System.out.println("--BlackChessman construct exec!!");
    }

    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        this.show();
    }


}
