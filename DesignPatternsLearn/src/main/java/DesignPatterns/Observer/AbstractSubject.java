package DesignPatterns.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by hjw on 16/8/27.
 */
public abstract class  AbstractSubject implements Subject {

    private Vector<Observer>   vector = new Vector<Observer>();

    @Override
    public void add(Observer obs) {
       vector.add(obs);
    }

    @Override
    public void del(Observer obs) {
        vector.remove(obs);
    }

    @Override
    public void notifyObervers() {
        Enumeration<Observer> enumobs = vector.elements();
        while(enumobs.hasMoreElements()){
            enumobs.nextElement().update();
        }
    }
}


