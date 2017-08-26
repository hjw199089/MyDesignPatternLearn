package SheJiMoShiNaDianShi.Memento.MementoWhite;

/**
 * Created by hjw on 16/9/15.
 *
 * 管理者
 */
public class Caretaker {
    private Memento memento;

    /**
     *  获得备忘录对象
     */

    public Memento getMemento(){
        return memento;
    }


    /**
     * 保存备忘录对象
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
