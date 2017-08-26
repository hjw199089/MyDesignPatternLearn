package DesignPatterns.factoryMethod.GeneralFactory;

/**
 * Created by hjw on 16/8/25.
 */
public class GeneralFactory {

    public Sender  produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("input right type");
            return null;
        }
    }
}
