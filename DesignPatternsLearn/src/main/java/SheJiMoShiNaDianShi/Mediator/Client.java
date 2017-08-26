package SheJiMoShiNaDianShi.Mediator;

/**
 * Created by hjw on 16/9/14.
 */
public class Client {
    public static void main(String[] args) {
        IMediator mediator = new Mediator();

        IUser userA = new UserA(mediator,"张三");
        IUser userB = new UserB(mediator,"李四");

        userA.sendMessage("大家好,我叫张三");
    }
}
