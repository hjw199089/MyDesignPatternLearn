package SheJiMoShiNaDianShi.Strategy;

/**
 * Created by hjw on 16/9/16.
 */
public interface IStrategy {

    /**
     *
     * 计算实际价格
     *
     * @param consumePrice
     * @return
     */


    public double realPrice(double consumePrice);
}
