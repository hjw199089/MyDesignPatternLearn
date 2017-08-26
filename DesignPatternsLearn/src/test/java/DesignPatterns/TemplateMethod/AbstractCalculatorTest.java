package DesignPatterns.TemplateMethod;

/**
 * Created by hjw on 16/8/27.
 */
public class AbstractCalculatorTest {
    public static void main(String[] args) {
        AbstractCalculator abstractCalculator = new Puls();
        String exp = "8+2";
        int res = abstractCalculator.calculate(exp,"\\+");
        System.out.println(exp + " = " + res);
    }
}
