package DesignPatterns.Decorator;

/**
 * Created by hjw on 16/8/25.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source  = new Source();
        Sourceable decorator =  new Decorator(source);
        source.method();
        System.out.println("----------------------");
        decorator.method();
    }
}
