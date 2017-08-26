package DesignPatterns.Memento;

/**
 * Created by hjw on 16/8/27.
 */
public class Storage {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {

        return memento;
    }

    public Storage(Memento memento) {

        this.memento = memento;
    }
}
