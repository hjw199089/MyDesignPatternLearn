package DesignPatterns.ChainofResponsibility;

/**
 * Created by hjw on 16/8/27.
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }



    @Override
    public void operator() {
        System.out.println(name + " deal");
        if(getHandler() != null)
            getHandler().operator();

    }
}
