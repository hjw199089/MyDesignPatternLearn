package DesignPatterns.Bridge;

/**
 * Created by hjw on 16/8/26.
 */
public class MyBridge extends Bridge{
    public void method(){
        getSource().method();
    }
}
