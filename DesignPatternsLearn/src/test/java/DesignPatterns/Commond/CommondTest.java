package DesignPatterns.Commond;

import DesignPatterns.Command.Invoker;
import DesignPatterns.Command.MyCommond;
import DesignPatterns.Command.Receiver;

/**
 * Created by hjw on 16/8/27.
 */
public class CommondTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new MyCommond(new Receiver()));
        invoker.action();
    }
}
