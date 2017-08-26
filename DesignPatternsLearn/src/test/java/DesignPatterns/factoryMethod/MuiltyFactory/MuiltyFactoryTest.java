package DesignPatterns.factoryMethod.MuiltyFactory;

import DesignPatterns.factoryMethod.GeneralFactory.Sender;

/**
 * Created by hjw on 16/8/25.
 */
public class MuiltyFactoryTest {
    public static void main(String[] args){
        MuiltyFactory factory = new MuiltyFactory();
        Sender mailsender = factory.produceMail();
        Sender smssender = factory.produceSmsSender();
        mailsender.send();
        smssender.send();
    }
}
