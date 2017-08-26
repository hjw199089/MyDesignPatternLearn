package SheJiMoShiNaDianShi.Strategy;

import java.util.Random;

/**
 * Created by hjw on 16/9/16.
 */
public class Client {
    public static void main(String[] args) {


        //创建上下文环境实例
        Context context = new Context();

        Random random = new Random();

        for (int i  = 0; i< 10; i++){
            int x = random.nextInt(2);

            //消费价格随机产生
            double consumePrice = 0;
            while ((consumePrice = random.nextInt(2000) )== 0){

            }

            switch (x){
                case 0:
                    //8折策略
                    context.setStrategy(new RebateStrategy());
                    break;
                case 1:
                    //1000以上减200策略
                    context.setStrategy(new RebateStrategy());
                    break;
            }

            System.out.println("原价为:" + consumePrice + (x == 0?"打8折策略":"满1000减200策略")
            +"打折后的价格为:"+context.cul(consumePrice)
            );


        }
    }
}
