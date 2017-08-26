package SheJiMoShiNaDianShi.Strategy;

import java.math.BigDecimal;

/**
 * Created by hjw on 16/9/16.
 */
public class Context {
    //当前策略
    private IStrategy strategy;


    //设置当前策略
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }


    //使用当前策略计算价格
    public double cul(double consumePrice){

        //使用具体商品的促销策略获得实际消费金额
        double realPrice = this.strategy.realPrice(consumePrice);

        //格式化保留小数后1位,即精确到角
        BigDecimal bd = new BigDecimal(realPrice);
        bd = bd.setScale(1,BigDecimal.ROUND_DOWN);
        return  bd.doubleValue();
    }
}
