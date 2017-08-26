package DesignPatterns.Strategy;

/**
 * Created by hjw on 16/8/27.
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "8+2";
        String exp2 = "8-2";

        ICalculator iCalculator = new Plus();

        int res = iCalculator.calculate(exp);
        System.out.println(exp + " =  "+ res);

        iCalculator = new Minus();
        res = iCalculator.calculate(exp2);
        System.out.println(exp2 + " =  "+ res);


    }

}
