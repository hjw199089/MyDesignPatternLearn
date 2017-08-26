package DesignPatterns.Visitor;

/**
 * Created by hjw on 16/8/27.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
