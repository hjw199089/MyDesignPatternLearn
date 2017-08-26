package DesignPatterns.AbstractFactory;

import DesignPatterns.factoryMethod.GeneralFactory.Sender;
import DesignPatterns.factoryMethod.GeneralFactory.SmsSender;

/**
 * Created by hjw on 16/8/25.
 */
public class SmsSenderFactory implements AbstractFactory {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
