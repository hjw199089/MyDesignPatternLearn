package SheJiMoShiNaDianShi.Composite;

import SheJiMoShiNaDianShi.Composite.sub.Employees;
import SheJiMoShiNaDianShi.Composite.sub.Manager;

/**
 * Created by hjw on 16/9/3.
 */
public class MainApp {
    public static void main(String[] args) {
        //CEO
        Staff CEO = new Manager("1","hjw","CEO",1000000);

        //部门经理
        Staff manager1 = new Manager("11","张总","财务经理",1222);
        Staff manager2 = new Manager("12","李总","人事经理",1222);

        //财务员工
        Staff employee1 = new Employees("111","王1","会记",123);
        //人事员工
        Staff employee2 = new Employees("121","赵1","HR",123);

        CEO.add(manager1);
        CEO.add(manager2);

        manager1.add(employee1);
        manager2.add(employee2);

        CEO.printUserBaseInfo();
        CEO.printEmployeeInfo(1);

    }
}

