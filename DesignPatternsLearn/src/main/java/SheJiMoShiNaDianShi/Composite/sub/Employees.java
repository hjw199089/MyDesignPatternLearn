package SheJiMoShiNaDianShi.Composite.sub;

import SheJiMoShiNaDianShi.Composite.Staff;

/**
 * Created by hjw on 16/9/3.
 */
public class Employees extends Staff {
    public Employees(String no, String name, String position, float salary) {
        super(no, name, position, salary);
    }

    @Override
    public void add(Staff staff) {

    }

    @Override
    public Staff remove(String no) {
        return null;
    }

    @Override
    public void printEmployeeInfo(int layer) {
        return;
    }
}
