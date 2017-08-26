package SheJiMoShiNaDianShi.SingleTon;

/**
 * Created by hjw on 16/8/31.
 *
 * 1:静态私有共享对象
 * 2:私有构造方法
 * 3:获得私有对象的方法
 *
 */
public class SyncronizedSingleTon {

    //类共享实例变量
    private static SyncronizedSingleTon singleTon = null;

    //私有构造方法
    private SyncronizedSingleTon() {
        System.out.println("-------私有构造方法----------");

    }

    //获得单例对象
    public synchronized static SyncronizedSingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new SyncronizedSingleTon();
        }
        return singleTon;
    }
}
