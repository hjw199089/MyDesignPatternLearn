package SheJiMoShiNaDianShi.SingleTon;

/**
 * Created by hjw on 16/9/1.
 */
public class GlobalSingleTonMainApp {
    public static void main(String[] args) {

        GlobalSingleTon globalSingleTon1 = GlobalSingleTon.getInstance();
        GlobalSingleTon globalSingleTon2 = GlobalSingleTon.getInstance();

        if(globalSingleTon1 == globalSingleTon2){
            System.out.println("------两者相等!!------");
        }else{
            System.out.println("------两者不相等!!------");
        }
    }
}
