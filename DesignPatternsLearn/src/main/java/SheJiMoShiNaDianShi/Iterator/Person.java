package SheJiMoShiNaDianShi.Iterator;

/**
 * Created by hjw on 16/9/14.
 */
public class Person implements  IPerson {

    //姓名
    private String name;

    //
    private   int age;

    //性别(1:男  0:女)
    private int sex;

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    @Override
    public String getPersonInfo() {
        return "姓名: " + this.name + "- 年龄: " + this.age + "- 性别: " + (this.sex == 0 ? "女" : "男") ;
    }
}
