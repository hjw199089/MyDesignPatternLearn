package DesignPatterns.Iterator;

/**
 * Created by hjw on 16/8/27.
 */
public class IteratorTest {
    public static void main(String[] args) throws Exception {
        String str[] = {"A","B","C"};
        MyCollec myCollec = new MyCollec(str);
        MyInterator itr = (MyInterator) myCollec.interator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
