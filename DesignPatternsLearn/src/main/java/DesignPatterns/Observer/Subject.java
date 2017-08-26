package DesignPatterns.Observer;

/**
 * Created by hjw on 16/8/27.
 */
public interface Subject {
    public void add(Observer obs);
    public void del(Observer obs);

    //通知所有观察者
    public void notifyObervers();

    //自身的一些操作
    public void operation();
}
