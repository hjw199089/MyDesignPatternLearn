package DesignPatterns.Strategy;

/**
 * Created by hjw on 16/8/27.
 */

//辅助函数
public abstract class AbstractCalculator {


    public int[] split(String exp, String opt){

        String[] Array = exp.split(opt);
        int arrayInt[] =  new int[2];

        arrayInt[0] = Integer.parseInt(Array[0]);
        arrayInt[1] = Integer.parseInt(Array[1]);

        return arrayInt;
    }
}
