package DesignPatterns.Adpter.AdpterObj;

/**
 * Created by hjw on 16/8/25.
 */
public class Wrapper implements Targetable{

    private Source source;


    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is method2 in Wrapper");
    }

    public Wrapper(Source source) {
        super();
        this.source = source;
    }
}
