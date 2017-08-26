package SheJiMoShiNaDianShi.Builder.model;

/**
 * Created by hjw on 16/8/29.
 * 创建产品-手机套餐
 */
public class MobilePackage {
    //话费
    private  float money;
    //短信
    private int shortInfo;
    //彩信
    private String music;

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(int shortInfo) {
        this.shortInfo = shortInfo;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}


