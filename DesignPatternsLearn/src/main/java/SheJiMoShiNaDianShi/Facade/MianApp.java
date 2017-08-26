package SheJiMoShiNaDianShi.Facade;

/**
 * Created by hjw on 16/9/4.
 */
public class MianApp {
    public static void main(String[] args) {
        ICookFacade cookFacade = new CookFacade();
        cookFacade.cookSpareribs();
    }

}
