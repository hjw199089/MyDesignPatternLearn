package DesignPatterns.factoryMethod.GeneralFactory;

/**
 * Created by hjw on 16/8/25.
 */
public class GeneralFactoryTest {
    public static void main(String[] args){
        GeneralFactory factory =  new GeneralFactory();
        factory.produce("mail").send();
        factory.produce("sms").send();
    }
}
