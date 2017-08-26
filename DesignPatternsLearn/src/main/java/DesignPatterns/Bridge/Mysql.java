package DesignPatterns.Bridge;

/**
 * Created by hjw on 16/8/26.
 */
public class Mysql implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is mysql");
    }
}
