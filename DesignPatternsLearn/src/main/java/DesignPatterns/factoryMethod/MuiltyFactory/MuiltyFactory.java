package DesignPatterns.factoryMethod.MuiltyFactory;


import DesignPatterns.factoryMethod.GeneralFactory.MailSender;
import DesignPatterns.factoryMethod.GeneralFactory.Sender;
import DesignPatterns.factoryMethod.GeneralFactory.SmsSender;

/**
 * Created by hjw on 16/8/25.
 */
public class MuiltyFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSmsSender(){
        return new SmsSender();
    }
}
