package DesignPatterns.Iterator;

/**
 * Created by hjw on 16/8/27.
 */
public interface Iterator {
    public Object previous() throws Exception;
    public Object next() throws Exception;
    public boolean hasNext();
    public Object fist() throws Exception;
}
