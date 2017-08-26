package DesignPatterns.Decorator;

/**
 * Created by hjw on 16/8/25.
 */
public class Decorator implements Sourceable {

    private  Sourceable Source;

    public Decorator(Sourceable source) {
        super();
        Source = source;
    }

    //通过装饰类
    @Override
    public void method() {
        System.out.println("this is Decorator");
        Source.method();
        System.out.println("this is new function");

    }
}
