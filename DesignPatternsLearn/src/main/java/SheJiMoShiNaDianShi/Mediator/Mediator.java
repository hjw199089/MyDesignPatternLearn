package SheJiMoShiNaDianShi.Mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hjw on 16/9/14.
 */

public class Mediator implements  IMediator{

    private final List<IUser> list = new ArrayList<IUser>();


    /**
     *
     * 注册用户信息
     *
     * @param user
     */
    @Override
    public void regist(IUser user) {
        if(user != null && !list.contains(user)){
            list.add(user);
        }
    }

    /**
     *
     * 发送消息给所有人
     *
     * @param user
     */
    @Override
    public void notifyAllMessage(IUser user) {
        Iterator<IUser > iterator = list.iterator();
        IUser temp = null;
        while (iterator.hasNext()){
            temp = iterator.next();
            if(temp != null && !temp.equals(user)){
                //排除发送用户向 所有用户发送消息
                temp.receiveMessage(user.getMessage());
            }
        }
    }
}
