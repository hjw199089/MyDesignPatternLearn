package DesignPatterns.State;

/**
 * Created by hjw on 16/8/27.
 */
public class StateTest {
    public static void main(String[] args) {
        Stage stage = new Stage("stage1");
        Contex contex = new Contex(stage);
        contex.method();

        stage.setValue("stage2");
        contex.method();
    }
}
