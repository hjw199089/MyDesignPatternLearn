package DesignPatterns.factoryMethod.StaticFactory;

import DesignPatterns.factoryMethod.GeneralFactory.Sender;

/**
 * Created by hjw on 16/8/25.
 */
public class StaticFactoryTest {
    public static void main(String[] args) {

        Sender mailsender = StaticFactory.produceMail();
        Sender smssender = StaticFactory.produceSmsSender();
        mailsender.send();
        smssender.send();

    }

}
