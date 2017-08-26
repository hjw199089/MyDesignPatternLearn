package DesignPatterns.Iterator;

/**
 * Created by hjw on 16/8/27.
 */
public class MyCollec implements Collec {

    String str[];

    public MyCollec(String[] str) {
        this.str = str;
    }

    @Override
    public Iterator interator() {
        return new MyInterator(this); //!!!!!!!
    }

    @Override
    public Object get(int i) throws Exception {
        if(i < str.length && i >= 0)
            return str[i];
        else throw new Exception("ERROE");
    }

    @Override
    public int size() {
        return str.length;
    }
}
