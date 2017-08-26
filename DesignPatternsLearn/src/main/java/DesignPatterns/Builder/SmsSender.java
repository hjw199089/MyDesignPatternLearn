package DesignPatterns.Builder;

/**
 * Created by hjw on 16/8/25.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is SmsSender");
    }
}
