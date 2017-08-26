package SheJiMoShiNaDianShi.Adapter.Class.power;

/**
 * Created by hjw on 16/9/1.
 *
 * 抽象电源基类
 */
public  abstract class AbsBasePower {

    private float power = 0;
    private String  unit = "V";

    public AbsBasePower(float power) {
        this.power = power;
    }

    public float getPower() {
        return power;
    }

    public String getUnit() {
        return unit;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}

