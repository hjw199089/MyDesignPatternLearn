package SheJiMoShiNaDianShi.Mediator;

/**
 * Created by hjw on 16/9/14.
 */
public abstract class AbstractUser implements IUser {

    protected  IMediator mediator;
    protected String name;
    protected String message;

    public AbstractUser(IMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }



    @Override
    public void sendMessage(String message) {
       this.message = message;
        System.out.println(this.name + "说: "+ this.message);
        mediator.notifyAllMessage(this);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
