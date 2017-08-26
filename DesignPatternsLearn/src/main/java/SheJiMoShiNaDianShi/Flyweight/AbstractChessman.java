package SheJiMoShiNaDianShi.Flyweight;

/**
 * Created by hjw on 16/9/4.
 */
public abstract class AbstractChessman {
    //内涵属性(黑/白)
    protected  String chess;

    //外蕴属性(棋子坐标)
    protected int x;
    protected int y;


    public AbstractChessman(String chess) {
        this.chess = chess;
    }

    /**
     * 点坐标设置
     *
     */
    public abstract void point(int x, int y);

    //显示棋子信息
    public void show(){
        System.out.println(this.chess + "(" + this.x+ ","+this.y+")");
    }
}
