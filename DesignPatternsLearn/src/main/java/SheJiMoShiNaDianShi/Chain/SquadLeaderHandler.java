package SheJiMoShiNaDianShi.Chain;

/**
 * Created by hjw on 16/9/4.
 */
public class SquadLeaderHandler extends AbstractHandler {

    public SquadLeaderHandler() {
        super(0);
    }

    @Override
    public void process(IStudent student) {
        System.out.println("班长 批复:"+student.getRequestMessage());
    }
}
