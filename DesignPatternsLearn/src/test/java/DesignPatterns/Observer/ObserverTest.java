package DesignPatterns.Observer;

/**
 * Created by hjw on 16/8/27.
 */
public class ObserverTest {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        mySubject.add(new ObserverSub1());
        mySubject.add(new ObserverSub2());
        mySubject.operation();
    }
}
