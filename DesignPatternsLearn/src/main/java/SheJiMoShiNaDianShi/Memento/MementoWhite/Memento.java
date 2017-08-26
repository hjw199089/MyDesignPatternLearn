package SheJiMoShiNaDianShi.Memento.MementoWhite;

/**
 * Created by hjw on 16/9/15.
 * <p>
 * 备忘录
 */
public class Memento {

    //血液值
    private int blood;

    //武力值
    private int sword;

    public Memento(int blood, int sword) {
        this.blood = blood;
        this.sword = sword;
    }

    public int getBlood() {
        return blood;
    }

    public int getSword() {
        return sword;
    }
}

