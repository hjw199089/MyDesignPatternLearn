package DesignPatterns.TemplateMethod;

/**
 * Created by hjw on 16/8/27.
 */
 public abstract class AbstractCalculator {

    abstract public int calculate(int num1, int num2);

    /*主方法，实现对本类其它方法的调用*/
    public final  int calculate(String exp, String opt){
        int array[] = split(exp,opt);
        return calculate(array[0] , array[1]);
    }

    //辅助函数
    public int[] split(String exp,String opt){
        String arrayString[] = exp.split(opt);
        int arrayInt[] =  new int[2];

        arrayInt[0] = Integer.parseInt(arrayString[0]);
        arrayInt[1] = Integer.parseInt(arrayString[1]);
        return arrayInt;

    }



}
