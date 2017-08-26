package DesignPatterns.AbstractFactory;

import DesignPatterns.factoryMethod.GeneralFactory.MailSender;
import DesignPatterns.factoryMethod.GeneralFactory.Sender;

/**
 * Created by hjw on 16/8/25.
 */
public class MailSenderFactory implements AbstractFactory {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}

