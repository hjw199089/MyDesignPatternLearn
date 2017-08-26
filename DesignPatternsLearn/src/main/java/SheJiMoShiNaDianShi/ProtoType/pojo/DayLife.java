package SheJiMoShiNaDianShi.ProtoType.pojo;

/**
 * Created by hjw on 16/8/31.
 *
 *  构建原型类-可克隆
 */
public class DayLife implements Cloneable {
    //起床
    private String getUp;
    //坐公交
    private String byBus;
    //下车买早点
    private String getFood;

    //中午小憩
    private String noon;
    //下午开始工作
    private String aftenoonWork;
    //下班回家
    private String goHome;

    //晚上休闲
    private String night;

    public DayLife() {

    }

    public DayLife(String getUp, String byBus, String getFood, String noon, String aftenoonWork, String goHome, String night) {
        this.getUp = getUp;
        this.byBus = byBus;
        this.getFood = getFood;
        this.noon = noon;
        this.aftenoonWork = aftenoonWork;
        this.goHome = goHome;
        this.night = night;
    }

    public String getGetUp() {
        return getUp;
    }

    public String getByBus() {
        return byBus;
    }

    public String getGetFood() {
        return getFood;
    }

    public String getNoon() {
        return noon;
    }

    public String getAftenoonWork() {
        return aftenoonWork;
    }

    public String getGoHome() {
        return goHome;
    }

    public String getNight() {
        return night;
    }


    public void setGetUp(String getUp) {
        this.getUp = getUp;
    }

    public void setByBus(String byBus) {
        this.byBus = byBus;
    }

    public void setGetFood(String getFood) {
        this.getFood = getFood;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public void setAftenoonWork(String aftenoonWork) {
        this.aftenoonWork = aftenoonWork;
    }

    public void setGoHome(String goHome) {
        this.goHome = goHome;
    }

    public void setNight(String night) {
        this.night = night;
    }


    /**
     * 打印日常生活信息
     *
     */
    public void print(){
        System.out.println(this.getGetUp());
        System.out.println(this.getByBus());
        System.out.println(this.getGetFood());
        System.out.println(this.getNoon());
        System.out.println(this.getAftenoonWork());
        System.out.println(this.getGoHome());
        System.out.println(this.getNight());
    }

    /**
     *
     * 重写clone方法
     *
     */
    public DayLife colne() {
        try{
            //调用Obkect类的方法
            return (DayLife) super.clone();
        }catch (Exception e){

        }
        return  null;
    }
}
