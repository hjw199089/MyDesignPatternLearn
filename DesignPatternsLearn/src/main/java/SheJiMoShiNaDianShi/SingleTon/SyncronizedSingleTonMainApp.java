package SheJiMoShiNaDianShi.SingleTon;

/**
 * Created by hjw on 16/9/1.
 */
public class SyncronizedSingleTonMainApp {
    public static void main(String[] args) {
        SyncronizedSingleTon syncronizedSingleTon1 =  SyncronizedSingleTon.getInstance();
        SyncronizedSingleTon syncronizedSingleTon2 = SyncronizedSingleTon.getInstance();

        if(syncronizedSingleTon1 == syncronizedSingleTon2){
            System.out.println("------两者相等------");
        }else{
            System.out.println("------两者不相等------");
        }
    }
}
