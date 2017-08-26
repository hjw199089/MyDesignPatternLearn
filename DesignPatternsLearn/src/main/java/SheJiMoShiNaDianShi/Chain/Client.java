package SheJiMoShiNaDianShi.Chain;

import java.util.Random;

/**
 * Created by hjw on 16/9/4.
 */
public class Client {
    public static void main(String[] args) {
        ProcessHandler processHandler = ProcessHandler.getInstance();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int radom = random.nextInt(3);
            IStudent iStudent = new Student("学生"+i+"生病了,请假",radom);

            System.out.println("+++++++++++++++");
            processHandler.sendMessage(iStudent);
            System.out.println("+++++++++++++++");
        }
    }
}
