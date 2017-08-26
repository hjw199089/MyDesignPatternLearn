package SheJiMoShiNaDianShi.Factory.model;

/**
 * Created by hjw on 16/8/28.
 * 抽象的产品
 */
public abstract class AbstractSword {

    //宝刀的名字
    private String name;

    public AbstractSword(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
