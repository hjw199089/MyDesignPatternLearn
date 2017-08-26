package DesignPatterns.Strategy;

/**
 * Created by hjw on 16/8/26.
 */
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {

        int arrayInt[] = split(exp,"\\+");

        return arrayInt[0] + arrayInt[1];
    }
}
