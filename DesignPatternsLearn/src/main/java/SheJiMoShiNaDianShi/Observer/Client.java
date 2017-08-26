package SheJiMoShiNaDianShi.Observer;

import java.util.Random;

/**
 * Created by hjw on 16/9/16.
 */
public class Client {
    public static void main(String[] args) {


        //创建观察员对象
        ISubject subject = new Subject();

        // 添加观察者
        subject.add(new PersonObserver());

        subject.add(new GovernmentObserver());

        Random random = new Random();
        int i = 0;
        while (++i < 10){
            subject.setTemperature(random.nextInt(45));
        }
    }
}
