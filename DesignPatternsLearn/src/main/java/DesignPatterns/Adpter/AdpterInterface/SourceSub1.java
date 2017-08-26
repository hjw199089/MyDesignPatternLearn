package DesignPatterns.Adpter.AdpterInterface;

/**
 * Created by hjw on 16/8/25.
 */
public class SourceSub1 extends Wrapper{
    //只实现方法1
    @Override
    public void method1(){
        System.out.println("this is method1  in SourceSub1");
    }
}
