package DesignPatterns.Visitor;

/**
 * Created by hjw on 16/8/27.
 */
public class Myvisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject: " + subject.getSubject());
    }
}
