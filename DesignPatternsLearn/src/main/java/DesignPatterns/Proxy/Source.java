package DesignPatterns.Proxy;

/**
 * Created by hjw on 16/8/26.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is method in Source");
    }
}
