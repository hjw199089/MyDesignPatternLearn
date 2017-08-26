package SheJiMoShiNaDianShi.Chain;

/**
 * Created by hjw on 16/9/4.
 *
 * 学生接口
 */
public interface IStudent {
    /**
     * 获得学生病情状态
     *
     * 0:小事 班长处理
     * 1:老师处理
     * 2:校长处理
     */

    public int getState();

    /**
     * 获得学生请假消息
     *
     */

    public String getRequestMessage();


}
