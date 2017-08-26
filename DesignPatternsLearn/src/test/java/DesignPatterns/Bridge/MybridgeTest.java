package DesignPatterns.Bridge;

/**
 * Created by hjw on 16/8/26.
 */

public class MybridgeTest {
    public static void main(String[] args) {
        Bridge mybidge = new MyBridge();

        Mysql mysql = new Mysql();
        mybidge.setSource(mysql);
        mybidge.method();

        System.out.println("------------");

        Hive hive = new Hive();
        mybidge.setSource(hive);
        mybidge.method();

    }




}
