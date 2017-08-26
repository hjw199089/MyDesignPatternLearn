package SheJiMoShiNaDianShi.Facade;

/**
 * Created by hjw on 16/9/3.
 *
 *
 * 外观模式制作糖醋排骨
 *
 */
public class CookFacade implements  ICookFacade{

    //糖醋排骨接口
    private final ISpareribs spareribs = new Spareribs();

    //做糖醋排骨

    @Override
    public void cookSpareribs() {
        spareribs.prepair();
        spareribs.preseve();
        spareribs.fry();
        spareribs.juice();
    }
}
