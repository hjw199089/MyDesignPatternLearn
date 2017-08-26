package SheJiMoShiNaDianShi.Iterator;

/**
 * Created by hjw on 16/9/14.
 */
public class Client {
    public static void main(String[] args) {

        IPersonList personList = new PersonList();

        MyIterator myIterator = personList.iterator();

        while (myIterator.hasNext()){
            IPerson person = (IPerson) myIterator.next();
            if(person != null){
                System.out.println(person.getPersonInfo());
            }
        }
    }
}
