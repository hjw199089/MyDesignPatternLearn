package DesignPatterns.Memento;

/**
 * Created by hjw on 16/8/27.
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public void setValue(String value) {

        this.value = value;
    }

    public String getValue() {

        return value;
    }
}
