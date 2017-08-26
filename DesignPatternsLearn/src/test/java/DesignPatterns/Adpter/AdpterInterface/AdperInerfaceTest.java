package DesignPatterns.Adpter.AdpterInterface;

/**
 * Created by hjw on 16/8/25.
 */
public class AdperInerfaceTest {
    public static void main(String[] args) {
        Sourceable sourceSub1 = new SourceSub1();
        Sourceable sourceSub2 = new SourceSub2();

        sourceSub1.method1();
        sourceSub2.method2();
    }
}
