package DesignPatterns.State;

/**
 * Created by hjw on 16/8/27.
 */
public class Contex {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {

        return stage;
    }

    public Contex(Stage stage) {
        this.stage = stage;
    }

    public void method(){
        if (stage.getValue().equals("stage1"))
            stage.method1();
        else
            stage.method2();
    }
}
