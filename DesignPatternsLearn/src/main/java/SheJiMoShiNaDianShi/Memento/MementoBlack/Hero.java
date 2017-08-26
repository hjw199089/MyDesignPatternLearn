package SheJiMoShiNaDianShi.Memento.MementoBlack;

import java.util.Random;

/**
 * Created by hjw on 16/9/15.
 *
 *
 * 备忘录发起者-Hero
 *
 *
 */
public class Hero {

    //血液值
    private int blood;
    //武力值
    private int sword;

    //随机数
    private final Random random = new Random();

    public Hero() {
        this.blood = 100;
        this.sword = 100;
    }

    //创建备忘录保存内容
    public Memento createMemento(){
        System.out.println("创建备忘录...");
        return new Memento(this.blood,this.sword);
    }

    //恢复备忘录
    public void  restoreFromMemento(Memento memento){
        System.out.println("恢复备忘录中的状态...");
        if(memento != null){
            this.blood = memento.getBlood();
            this.sword = memento.getSword();
        }
    }

    /**
     *  挑战Boss
     */
    public int koBoss(){

        if (this.blood <= 0 || this.sword <=0){
            System.out.println(this.toString());
            System.out.println("挑战失败!");
            return  -1;
        }else{
            //获得随机数
            double win = Math.random();
            if(win <= 0.02){
                System.out.println("恭喜战胜Boss...");
                return 1;
            }else{
                System.out.println("继续攻击Boss...");
                System.out.println(this.toString());
                int blood_sub = random.nextInt(10);
                int sword_sub = random.nextInt(10);
                this.blood -= blood_sub;
                this.sword -= sword_sub;
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "blood=" + blood +
                ", sword=" + sword +
                '}';
    }

    class Memento implements  INarroMemento{
        private final int blood;
        private final int sword;

        private Memento(int blood, int sword) {
            this.blood = blood;
            this.sword = sword;
        }

        private int getBlood() {
            return blood;
        }

        private int getSword() {
            return sword;
        }
    }
}

