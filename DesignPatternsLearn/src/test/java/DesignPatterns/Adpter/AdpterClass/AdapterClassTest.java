package DesignPatterns.Adpter.AdpterClass;

import DesignPatterns.Adpter.AdpterClass.AdpterClass;
import DesignPatterns.Adpter.AdpterClass.Targetable;

/**
 * Created by hjw on 16/8/25.
 */
public class AdapterClassTest {
    public static void main(String[] args) {
        Targetable target = new AdpterClass();
        target.method1();
        target.method2();
    }
}
