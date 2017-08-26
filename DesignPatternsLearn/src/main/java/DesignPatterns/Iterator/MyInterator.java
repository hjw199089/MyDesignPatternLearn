package DesignPatterns.Iterator;

/**
 * Created by hjw on 16/8/27.
 */
public class MyInterator implements Iterator {

    private Collec collec;
    int pos = -1;

    public MyInterator(Collec collec) {
        this.collec = collec;
    }

    @Override
    public Object previous() throws Exception {
        if (pos > 0)
            pos--;
        return collec.get(pos);
    }

    @Override
    public Object next() throws Exception {
        if (pos < collec.size() - 1)
            pos++;
        return collec.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collec.size() - 1)
            return true;
        else
            return false;
    }

    @Override
    public Object fist() throws Exception {
        pos = 0;

        return collec.get(pos);
    }
}
