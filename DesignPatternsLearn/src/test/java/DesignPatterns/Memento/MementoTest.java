package DesignPatterns.Memento;

/**
 * Created by hjw on 16/8/27.
 */
public class MementoTest {
    public static void main(String[] args) {
        Original original = new Original("fisrt");
        Storage storage = new Storage(original.createMemento());

        System.out.println("舒适化状态: "+original.getValue());
        original.setValue("second");
        System.out.println("修改后的状态: "+original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("还原后的状态: " + original.getValue());
    }
}
