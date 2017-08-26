package SheJiMoShiNaDianShi.MultipleTon;

import java.util.ArrayList;

/**
 * Created by hjw on 16/9/1.
 * 多例模式
 */
public class MultipleTon {

    private  static  final int  N = 10;

    private static ArrayList<MultipleTon> arrayList = new ArrayList<MultipleTon>(N);

    //每个对象的序号
    private int no;

    //私有构造方法
    private MultipleTon (int no){
        this.no = no;
        System.out.println("-----构造第"+this.no+"号对象-----");
    }

    //实例化N个对象实例
    static{
        for(int i=0; i<N;i++){
            arrayList.add(new MultipleTon(i));
        }
    }


    public int getNo() {
        return no;
    }

    public static MultipleTon getInstance(int no){
        return arrayList.get(no);
    }
}
