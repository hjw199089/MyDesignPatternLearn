package SheJiMoShiNaDianShi.Chain;

/**
 * Created by hjw on 16/9/4.
 *
 * 外观责任链
 */
public class ProcessHandler {

    private  final IHandler sqmshandler;
    private final IHandler teschhandler;
    private  final IHandler scmshandler;

    //单例模式
    private static ProcessHandler processHandler =  new ProcessHandler();

    private ProcessHandler() {
        this.sqmshandler = new SquadLeaderHandler();
        this.teschhandler = new TeacherHandler();
        this.scmshandler = new SchoolMasterHandler();

        //创建责任链
        this.sqmshandler.setHandler(this.teschhandler);
        this.teschhandler.setHandler(this.scmshandler);
    }

    /**
     * 获得单例对象实例
     */

    public  static ProcessHandler getInstance(){
        return processHandler;
    }

    /**
     * 发送请假请求
     */
    public void sendMessage(IStudent student){
        this.sqmshandler.handleRequest(student);
    }

}
