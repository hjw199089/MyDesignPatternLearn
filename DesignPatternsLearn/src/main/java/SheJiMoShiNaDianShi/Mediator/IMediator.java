package SheJiMoShiNaDianShi.Mediator;

/**
 * Created by hjw on 16/9/14.
 */
public interface IMediator {
    /**
     * 中介者接口
     */


    /**
     * 注册用户信息
     *
     * @param user
     */
    public void regist(IUser user);

    /**
     *
     * 发送消息给所有人
     *
     * @param user
     */
    public void notifyAllMessage(IUser user);
}
