package SheJiMoShiNaDianShi.Command;

/**
 * Created by hjw on 16/9/13.
 * 接收者接口
 */
public interface IReceiver {

    /**
     *
     * 接受信件读取
     * @param message
     */
    public void readMail(String message);

}
