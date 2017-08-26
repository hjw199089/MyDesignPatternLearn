package DesignPatterns.Adpter.AdpterClass;

/**
 * Created by hjw on 16/8/25.
 */
public class AdpterClass extends Source implements Targetable {

    //方法1 直接由Source提供

    @Override
    public void method2() {
        System.out.println("this is method2 of Adapter");
    }
}
