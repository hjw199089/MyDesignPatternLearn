package SheJiMoShiNaDianShi.Command;

/**
 * Created by hjw on 16/9/14.
 */
public class Post implements IPost {

    //持有一个收件人对象
    private final IReceiver  receiver;


    public Post(IReceiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 邮局发送信件
     *
     * @param message
     */

    @Override
    public void sendMail(String message) {
        this.receiver.readMail(message);
    }
}
