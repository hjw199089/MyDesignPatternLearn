package SheJiMoShiNaDianShi.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by hjw on 16/9/14.
 */
public class PersonIterator implements MyIterator {

   //
    private final ArrayList<IPerson> personList;


    private int index = -1;

    public PersonIterator(ArrayList<IPerson> list) {
        this.personList = list;
    }

    @Override
    public boolean hasNext() {
        return (this.personList == null ? false : (index < personList.size()-1));
    }

    @Override
    public Object next() {
        if (this.personList != null && (index < this.personList.size()-1)){
            return this.personList.get(++index);
        }
        return null;
    }

    @Override
    public Object remove() {

        if (this.personList != null){
            return this.personList.remove(index);

        }

        return null;

    }

}
