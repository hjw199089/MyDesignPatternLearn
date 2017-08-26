package DesignPatterns.Proxy;

/**
 * Created by hjw on 16/8/26.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
