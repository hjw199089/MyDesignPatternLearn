package DesignPatterns.Memento;

/**
 * Created by hjw on 16/8/27.
 */
public class Original {
    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        return new Memento(value);
    }

    public void restoreMemento(Memento memento) {
        value = memento.getValue();
    }
}
