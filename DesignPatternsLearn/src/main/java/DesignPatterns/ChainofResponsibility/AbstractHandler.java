package DesignPatterns.ChainofResponsibility;

/**
 * Created by hjw on 16/8/27.
 */
public abstract class  AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
