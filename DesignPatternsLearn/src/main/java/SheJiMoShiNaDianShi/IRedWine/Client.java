package SheJiMoShiNaDianShi.IRedWine;

/**
 * Created by hjw on 16/9/4.
 */
public class Client {

    public static void main(String[] args) {
        IRedWine redWine = new RealRedWineFactory();

        RedWineProxy redWineProxy = new RedWineProxy(redWine);

        redWineProxy.product();
        redWineProxy.sell();
    }


}
