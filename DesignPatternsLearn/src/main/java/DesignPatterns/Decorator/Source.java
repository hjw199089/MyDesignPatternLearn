package DesignPatterns.Decorator;

/**
 * Created by hjw on 16/8/25.
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is method in Source");
    }
}
