package SheJiMoShiNaDianShi.Mediator;

/**
 * Created by hjw on 16/9/14.
 */
public class UserA extends  AbstractUser {
    public UserA(IMediator mediator, String name) {
        super(mediator, name);
        mediator.regist(this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("UserA Received Message: " + message);
    }
}
