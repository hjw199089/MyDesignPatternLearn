package SheJiMoShiNaDianShi.Iterator;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hjw on 16/9/14.
 */
public class PersonList implements IPersonList {

    private ArrayList<IPerson> list = new ArrayList<IPerson>();

    public PersonList() {
        Random random = new Random();
        //创建人员信息

        for (int i = 0; i < 10; i++) {
            IPerson person = new Person("人员" + i, random.nextInt(30), random.nextInt(2));
            this.list.add(person);
        }
    }

    @Override
    public ArrayList<IPerson> getPersonList() {
        return this.list;
    }

    @Override
    public MyIterator iterator() {
        return new PersonIterator(this.list);
    }
}
