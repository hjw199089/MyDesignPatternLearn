package SheJiMoShiNaDianShi.Observer;

/**
 * Created by hjw on 16/9/16.
 */
public class GovernmentObserver implements IObserver {

    @Override
    public void update(ISubject subject) {
        System.out.println(" 政府收到高温预警: " + subject.temperatureReport());
    }
}
