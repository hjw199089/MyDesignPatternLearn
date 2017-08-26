package SheJiMoShiNaDianShi.Command;

/**
 * Created by hjw on 16/9/14.
 */
public class Receiver implements IReceiver {

    /**
     *
     * 收件人读取信件
     *
     * @param message
     *
     */

    @Override
    public void readMail(String message) {
        System.out.println("收件人读取信件: "+ message);
    }
}
