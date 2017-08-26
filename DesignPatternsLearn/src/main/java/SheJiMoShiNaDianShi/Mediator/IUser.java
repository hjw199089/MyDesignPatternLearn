package SheJiMoShiNaDianShi.Mediator;

/**
 * Created by hjw on 16/9/14.
 */
public interface IUser {


    /**
     * 接收消息
     *
     * @param message
     */

    public void receiveMessage(String message);


    /**
     * 发送消息
     *
     * @param message
     */
    public void sendMessage(String message);


    /**
     *  获得发送的消息
     * @return
     */
    public String getMessage();
}

