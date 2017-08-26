package DesignPatterns.Facade;

/**
 * Created by hjw on 16/8/26.
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("------------------");
        computer.stop();
    }
}
