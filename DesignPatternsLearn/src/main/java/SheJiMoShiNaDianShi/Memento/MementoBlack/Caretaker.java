package SheJiMoShiNaDianShi.Memento.MementoBlack;



/**
 * Created by hjw on 16/9/15.
 *
 * 管理者
 */
public class Caretaker {
    private INarroMemento memento;

    /**
     *  获得备忘录对象
     */

    public INarroMemento getMemento(){
        return memento;
    }


    /**
     * 保存备忘录对象
     * @param memento
     */
    public void setMemento(INarroMemento memento) {
        this.memento = memento;
    }
}
