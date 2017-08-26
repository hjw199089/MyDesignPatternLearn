package DesignPatterns.ChainofResponsibility;

/**
 * Created by hjw on 16/8/27.
 */
public class HandlerTest {
    public static void main(String[] args) {
        MyHandler m1 = new MyHandler("M1");
        MyHandler m2 = new MyHandler("M2");
        MyHandler m3 = new MyHandler("M3");

        m1.setHandler(m2);
        m2.setHandler(m3);

        m1.operator();
    }
}
