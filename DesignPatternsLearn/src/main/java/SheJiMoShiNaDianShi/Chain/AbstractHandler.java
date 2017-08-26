package SheJiMoShiNaDianShi.Chain;

/**
 * Created by hjw on 16/9/4.
 *
 * 抽象处理者
 * 持有下一个处理者,并进行消息传递
 *
 */
public abstract class AbstractHandler  implements IHandler{

    //下一个消息处理者
    private IHandler handler;
    //请假级别
    private int  state = -1;

    public AbstractHandler(int state) {
        this.state = state;
    }

    //处理请求,交由子类负责处理具体的处理
    public abstract  void process(IStudent student);

    //处理请求

    @Override
    public void handleRequest(IStudent student) {
        if (student != null){
            if(this.state == student.getState()){
                this.process(student);
            }else{
                if(this.handler != null){
                    System.out.printf("请求上级处理");
                    this.handler.handleRequest(student);
                }
            }
        }
    }

    @Override
    public void setHandler(IHandler handler) {
         this.handler = handler;
    }
}
