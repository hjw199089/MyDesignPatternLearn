package SheJiMoShiNaDianShi.Strategy;

/**
 * Created by hjw on 16/9/16.
 *
 * 1000以上减200的商品促销策略
 */
public class ReduceStrategy implements IStrategy {

    /**
     *
     * 计算实际价格的方法
     *
     * @param consumePrice
     * @return
     */
    @Override
    public double realPrice(double consumePrice) {


        if (consumePrice >= 1000){
            return consumePrice - 200;
        }
        return  consumePrice;
    }
}
