package SheJiMoShiNaDianShi.Observer;

/**
 * Created by hjw on 16/9/16.
 *
 * 观察员
 *
 */
public interface ISubject {

    /**
     * 增加观察者
     *
     * @param observer
     * @return
     */

    public  boolean add(IObserver observer);


    /**
     * 删除观察者
     *
     * @param observer
     * @return
     */
    public boolean remove(IObserver observer);


    /**
     *
     * 通知所有观察者
     */
    public void notifyAllObserver();


    /**
     * 设置温度值
     *
     * @param temperature
     */
    public void setTemperature(float temperature);


    /**
     * 获得温度预警
     *
     * @return
     */

    public String temperatureReport();

}
