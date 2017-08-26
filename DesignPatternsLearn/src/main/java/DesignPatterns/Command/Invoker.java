package DesignPatterns.Command;

/**
 * Created by hjw on 16/8/27.
 */
public class Invoker {
    private Commond commond;

    public Invoker(Commond commond) {
        this.commond = commond;
    }

    public void action(){
        commond.exe();
    }
}
