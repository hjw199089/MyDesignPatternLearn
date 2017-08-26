package DesignPatterns.Bridge;

/**
 * Created by hjw on 16/8/26.
 */
public abstract class Bridge {
    private Sourceable source;


    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

    public void method(){
        source.method();
    }
}
