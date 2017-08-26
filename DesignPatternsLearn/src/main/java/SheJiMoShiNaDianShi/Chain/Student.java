package SheJiMoShiNaDianShi.Chain;

/**
 * Created by hjw on 16/9/4.
 */
public class Student implements IStudent {
    //病情的大小状态
    private int state= -1;
    private final String message;

    public Student(String message, int state) {
        this.message = message;
        this.state = state;
    }

    @Override
    public int getState() {
        return this.state;
    }

    @Override
    public String getRequestMessage() {
        return this.message;
    }
}
