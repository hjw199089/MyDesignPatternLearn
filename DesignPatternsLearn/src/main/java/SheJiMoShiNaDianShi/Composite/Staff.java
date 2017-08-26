package SheJiMoShiNaDianShi.Composite;

/**
 * Created by hjw on 16/9/3.
 * <p>
 * <p>
 * 职工类接口
 */
public abstract class Staff {

    //员工号
    protected String no;
    //姓名
    protected String name;
    //职位
    protected String position;

    //薪资
    protected float salary;

    //私有属性,长度字符串
    private int length;

    //构造函数
    public Staff(String no, String name, String position, float salary) {
        this.no = no;
        this.name = name;
        this.position = position;
        this.salary = salary;

        //计算总字节长度
        this.length += (no == null || "".equals(no.trim())) ? 0 : no.getBytes().length;
        this.length += (name == null || "".equals(name.trim())) ? 0 : name.getBytes().length;
        this.length += (position == null || "".equals(position.trim())) ? 0 : position.getBytes().length;
        this.length += String.valueOf(salary).length();
    }

    //获得用户基本信息
    public void printUserBaseInfo() {
        System.out.println("|" + this.no + " " + this.name + " " + this.position + " " + this.salary);
    }

    //添加员工信息 --- 抽象方法让子类去实现
    public abstract void add(Staff staff);

    //删除员工
    public abstract Staff remove(String no);

    //打印员工信息
    public abstract void printEmployeeInfo(int layer);

    //打印若干字符
    protected void printChar(int layer){
        for (int j =0; j < layer*2;j++){
            System.out.print("-");
        }
    }

    //打印一行
    protected void printLine(){
        System.out.print("+");
        for (int i =0 ; i< this.length + 4;i++){
            System.out.print("-");
        }
        System.out.println("-");
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }

    public int getLength() {
        return length;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
