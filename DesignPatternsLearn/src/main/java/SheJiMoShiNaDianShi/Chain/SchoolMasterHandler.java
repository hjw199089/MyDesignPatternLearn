package SheJiMoShiNaDianShi.Chain;

/**
 * Created by hjw on 16/9/4.
 */
public class SchoolMasterHandler extends AbstractHandler {
    public SchoolMasterHandler() {
        super(2);
    }

    @Override
    public void process(IStudent student) {
        System.out.println("校长 批复:"+student.getRequestMessage());
    }
}
