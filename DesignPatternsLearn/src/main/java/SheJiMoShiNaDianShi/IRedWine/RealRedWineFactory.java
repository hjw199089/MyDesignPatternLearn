package SheJiMoShiNaDianShi.IRedWine;

/**
 * Created by hjw on 16/9/4.
 *
 * 真正的生产红酒的工厂
 */
public class RealRedWineFactory implements IRedWine{


    @Override
    public void product() {
        System.out.println("红酒厂生产红酒....");
    }

    @Override
    public void sell() {
        System.out.println("红酒工厂销售红酒....");
    }
}
