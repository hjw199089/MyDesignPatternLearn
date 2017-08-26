package SheJiMoShiNaDianShi.IRedWine;

/**
 * Created by hjw on 16/9/4.
 *
 * 代理
 */
public class RedWineProxy implements IRedWine {

    //真正的红酒生产商
    private final IRedWine redWine;

    //代理商是否有权限销售
    private  final boolean permission = true;

    public RedWineProxy(IRedWine redWine) {
        this.redWine = redWine;
    }


    //代理商生产酒的方法(不产酒 实际由真正生产商生产)

    @Override
    public void product() {

        if(this.permission == true){
            System.out.printf("这是合法的红酒代理商");
            System.out.println("代理商接到订单,通知工厂生产....");
            this.redWine.product();
        }else{
            System.out.println("这是非法的代理商....");
        }


    }

    @Override
    public void sell() {
        if (this.permission){
            this.redWine.sell();
            System.out.println("代理商出售...");
        }else{
            System.out.println("这是非法代理商");
        }

    }
}
