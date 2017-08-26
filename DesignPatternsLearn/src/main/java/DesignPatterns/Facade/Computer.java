package DesignPatterns.Facade;

/**
 * Created by hjw on 16/8/26.
 */
public class Computer {
    private CPU cpu ;
    private Memory memory ;
    private Disk   disk ;

    public Computer() {
        this.cpu =  new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup(){
        cpu.startup();
        memory.startup();
        disk.startup();
    }
    public void stop(){
        cpu.stop();
        memory.stop();
        disk.stop();
    }
}
