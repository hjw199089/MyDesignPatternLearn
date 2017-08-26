package SheJiMoShiNaDianShi.Chain;

/**
 * Created by hjw on 16/9/4.
 */
public class TeacherHandler extends AbstractHandler {
    public TeacherHandler() {
        super(1);
    }

    @Override
    public void process(IStudent student) {
        System.out.println("老师 批复:"+student.getRequestMessage());
    }
}
