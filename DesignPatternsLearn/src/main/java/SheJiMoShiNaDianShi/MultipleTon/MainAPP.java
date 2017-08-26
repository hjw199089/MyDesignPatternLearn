package SheJiMoShiNaDianShi.MultipleTon;

/**
 * Created by hjw on 16/9/1.
 */
public class MainAPP {
    public static void main(String[] args) {

       for (int i =0; i<10; i++){
           System.out.println("----"+MultipleTon.getInstance(i).getNo()+"-----");
       }

    }
}
