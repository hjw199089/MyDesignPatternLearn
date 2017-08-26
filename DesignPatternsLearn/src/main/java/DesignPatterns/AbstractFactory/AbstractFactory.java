package DesignPatterns.AbstractFactory;

import DesignPatterns.factoryMethod.GeneralFactory.Sender;

/**
 * Created by hjw on 16/8/25.
 */
public interface AbstractFactory {
    public Sender produce();
}
