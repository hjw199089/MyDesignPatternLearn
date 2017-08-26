package DesignPatterns.factoryMethod.StaticFactory;

import DesignPatterns.factoryMethod.GeneralFactory.MailSender;
import DesignPatterns.factoryMethod.GeneralFactory.Sender;
import DesignPatterns.factoryMethod.GeneralFactory.SmsSender;

/**
 * Created by hjw on 16/8/25.
 */
public class StaticFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSmsSender(){
        return new SmsSender();
    }
}
