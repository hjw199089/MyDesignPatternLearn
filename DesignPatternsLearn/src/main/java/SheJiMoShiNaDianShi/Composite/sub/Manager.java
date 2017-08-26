package SheJiMoShiNaDianShi.Composite.sub;

import SheJiMoShiNaDianShi.Composite.Staff;

import java.util.ArrayList;

/**
 * Created by hjw on 16/9/3.
 *
 *
 *
 * 管理者(手下有其他员工)
 */
public class Manager  extends Staff{

    //存储手下员工
    private final ArrayList<Staff> arrayList = new ArrayList<Staff>();

    // 构造方法
    public Manager(String no, String name, String position, float salary) {
        super(no, name, position, salary);
    }

    /**
     * 增加一个员工
     * @param staff
     */
    @Override
    public void add(Staff staff) {
        this.arrayList.add(staff);
    }

    /**
     * 删除一个员工
     *
     * @param no
     * @return
     */
    @Override
    public Staff remove(String no) {
        Staff staff = null;
        if (no != null && !"".equals(no.trim())){
            for (int i =0; i<this.arrayList.size(); i++){
                if (this.arrayList.get(i) == null){
                    continue;
                }
                if (no.equals(this.arrayList.get(i).getNo())){
                    staff=this.arrayList.remove(i);
                }
            }

        }
        return staff;
    }

    /**
     * 打印员工信息
     *
     * @param layer
     */
    @Override
    public void printEmployeeInfo(int layer) {
       int temLayer = ++layer;
        for (int  i =0; i<this.arrayList.size();i++){
            if(this.arrayList.get(i)==null){
                continue;
            }

            //打印"-"
            printChar(temLayer);
            //打印员工基本信息
            this.arrayList.get(i).printUserBaseInfo();

            this.arrayList.get(i).printEmployeeInfo(temLayer);

        }

    }
}
