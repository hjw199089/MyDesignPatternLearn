package SheJiMoShiNaDianShi.Flyweight;

import java.util.Random;

/**
 * Created by hjw on 16/9/4.
 */
public class Client {
    public static void main(String[] args) {

        FiveChessmanFactory fiveChessmanFactory = FiveChessmanFactory.getInstance();

        //随机数,用来产生随机棋子
        Random random = new Random();
        int radom = 0;
        AbstractChessman abstractChessman = null;

        //随机获得棋子
        for (int i=0; i<10; i++){
            //生成0-1之间随机数,用来随机获得棋子对象
            radom = random.nextInt(2);
            switch (radom){
                //获得黑棋子
                case 0: abstractChessman = fiveChessmanFactory.getChessmanObject('B');
                    break;
                case 1: abstractChessman = fiveChessmanFactory.getChessmanObject('W');
                    break;
            }
            if (abstractChessman != null){
                //设置外蕴属性(x:0-9, y:0:15 )
                abstractChessman.point(i,random.nextInt(15));
            }
        }
    }
}
