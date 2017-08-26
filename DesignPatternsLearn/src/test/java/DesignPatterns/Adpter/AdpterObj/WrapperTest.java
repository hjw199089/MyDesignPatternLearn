package DesignPatterns.Adpter.AdpterObj;

/**
 * Created by hjw on 16/8/25.
 */
public class WrapperTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
