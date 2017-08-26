package DesignPatterns.Command;

/**
 * Created by hjw on 16/8/27.
 */
public class MyCommond implements Commond {
    private Receiver receiver;

    public MyCommond(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();

    }
}
