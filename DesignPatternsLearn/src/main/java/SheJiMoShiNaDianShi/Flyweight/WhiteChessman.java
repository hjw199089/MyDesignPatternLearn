package SheJiMoShiNaDianShi.Flyweight;

/**
 * Created by hjw on 16/9/4.
 */
public class WhiteChessman extends AbstractChessman{

    /**
     *
     * 构造方法,初识化白棋子
     *
     */

    public WhiteChessman() {
        super("○");
        System.out.println("--WhiteChessman construct exec!!");
    }

    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        this.show();
    }
}
