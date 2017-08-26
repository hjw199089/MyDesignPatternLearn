package DesignPatterns.TemplateMethod;

/**
 * Created by hjw on 16/8/27.
 */
public class Puls extends AbstractCalculator{
    @Override
    public int calculate(int num1, int num2) {
       return num1 + num2;
    }
}
