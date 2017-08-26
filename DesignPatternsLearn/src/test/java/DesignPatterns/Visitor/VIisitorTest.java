package DesignPatterns.Visitor;

/**
 * Created by hjw on 16/8/27.
 */
public class VIisitorTest {
    public static void main(String[] args) {
        Visitor visitor = new Myvisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
        subject.getSubject();
    }
}
