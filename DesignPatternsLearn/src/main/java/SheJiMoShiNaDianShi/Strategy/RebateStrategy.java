package SheJiMoShiNaDianShi.Strategy;

/**
 * Created by hjw on 16/9/16.
 *
 *
 * 八折商品促销策略
 *
 */
public class RebateStrategy implements  IStrategy{

    private final double rate;

    public RebateStrategy() {
        this.rate = 0.8;
    }

    /**
     * 计算实际价格的方法
     *
     * @param consumePrice
     * @return
     */

    @Override
    public double realPrice(double consumePrice) {
        return consumePrice * this.rate;
    }
}
