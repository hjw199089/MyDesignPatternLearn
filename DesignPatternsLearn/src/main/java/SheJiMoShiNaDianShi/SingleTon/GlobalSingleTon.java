package SheJiMoShiNaDianShi.SingleTon;

/**
 * Created by hjw on 16/9/1.
 *
 * 全局变量的单例模式
 */
public class GlobalSingleTon {

    //全局静态共享变量
    private static GlobalSingleTon globalSingleTon = new GlobalSingleTon();

    //私有静态方法
    private GlobalSingleTon(){
        System.out.println("----私有构造方法---");
    }

    public static GlobalSingleTon getInstance(){
        return globalSingleTon;
    }
}
