package SheJiMoShiNaDianShi.Chain;

/**
 * Created by hjw on 16/9/4.
 *
 *
 * 抽象处理接口
 */
public interface IHandler {

    //处理请求
    public void handleRequest(IStudent student);

    //设置下一个处理者
    public void setHandler(IHandler handler);


}
