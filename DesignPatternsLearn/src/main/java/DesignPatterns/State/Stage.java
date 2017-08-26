package DesignPatterns.State;

/**
 * Created by hjw on 16/8/27.
 */
public class Stage {
    private String  value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {

        return value;
    }

    public Stage(String value) {

        this.value = value;
    }

    public void method1(){
        System.out.println("this is method1");
    }

    public void method2(){
        System.out.println("this is method2");
    }
}
