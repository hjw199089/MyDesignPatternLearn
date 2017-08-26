package DesignPatterns.Proxy;

/**
 * Created by hjw on 16/8/26.
 */

public class Proxy implements Sourceable {

    private Source  source ;

    public Proxy() {
        super();
        source = new Source();
    }

    @Override
    public void method() {
        System.out.println("this is method in Proxy");

    }
}
