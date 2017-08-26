package DesignPatterns.factoryMethod.GeneralFactory;

/**
 * Created by hjw on 16/8/25.
 */
public class MailSender implements  Sender {

    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
