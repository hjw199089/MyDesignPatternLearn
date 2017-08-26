package SheJiMoShiNaDianShi.State;

import DesignPatterns.State.Contex;

import java.util.Random;

/**
 * Created by hjw on 16/9/16.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        context.changeState(new EditState());


        Random random = new Random();
        for (int i =0; i< 5; i++){
            int r = random.nextInt(2);
            System.out.println("当前模式:"
            + (r == 0 ? "预览模式":(r == 1?"编辑模式":""))
            );
            context.doWork(r);
        }
    }
}
