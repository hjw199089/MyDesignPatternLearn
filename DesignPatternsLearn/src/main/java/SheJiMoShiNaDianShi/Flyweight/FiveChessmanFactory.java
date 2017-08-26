package SheJiMoShiNaDianShi.Flyweight;

import java.util.Hashtable;

/**
 * Created by hjw on 16/9/4.
 */
public class FiveChessmanFactory {
    //单例模式工厂
    private static FiveChessmanFactory fiveChessmanFactory = new FiveChessmanFactory();


    //缓存共享对象
    private final Hashtable<Character, AbstractChessman> cache = new Hashtable<Character, AbstractChessman>();

    //私有化构造方法
    private FiveChessmanFactory() {

    }

    //获得单例工厂
    public static FiveChessmanFactory getInstance(){
        return fiveChessmanFactory;
    }



    /**
     * 根据字符获得棋子
     * @param c
     *
     *  (B:黑棋子 W:白棋子)
     * @return
     */

    public AbstractChessman getChessmanObject(char c){

        //从缓存中获得棋子对象实例
        AbstractChessman abstractChessman = this.cache.get(c);

        if(abstractChessman == null){
            //缓存中没有棋子对象的实例信息,则创建对象实例
            switch (c){
                case 'B':
                    abstractChessman = new BlackChessman();
                    break;
                case 'W':
                    abstractChessman = new WhiteChessman();
                    break;
                default:
                    break;
            }

            if (abstractChessman != null){
                this.cache.put(c,abstractChessman);
            }

        }
        return abstractChessman;
    }
}
