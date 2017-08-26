package SheJiMoShiNaDianShi.Observer;

/**
 * Created by hjw on 16/9/16.
 *
 *
 * 具体观察者-个人用户
 */
public class PersonObserver implements  IObserver{

    @Override
    public void update(ISubject subject) {
        System.out.println(" 个人收到高温预警: " + subject.temperatureReport());
    }
}
