package DesignPatterns.AbstractFactory;

import DesignPatterns.factoryMethod.GeneralFactory.Sender;

/**
 * Created by hjw on 16/8/25.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory absFactory = new MailSenderFactory();
        Sender mailSender = absFactory.produce();
        mailSender.send();
    }
}
