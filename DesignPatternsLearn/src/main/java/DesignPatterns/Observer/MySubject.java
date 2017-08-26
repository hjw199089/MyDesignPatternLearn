package DesignPatterns.Observer;

/**
 * Created by hjw on 16/8/27.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self");
        //自身变化之后通知所有其他人
        notifyObervers();
    }
}
