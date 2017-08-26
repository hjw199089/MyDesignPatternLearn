package SheJiMoShiNaDianShi.Memento.MementoWhite;

/**
 * Created by hjw on 16/9/15.
 */
public class Client {
    public static void main(String[] args) {


        //创建角色
        Hero hero = new Hero();
        //创建管理者
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(hero.createMemento());

        //只有3次战胜Boss的机会
        int cnt = 1;
        //挑战Boss结果

        int ko = -1;

        while (ko != 1 && cnt <= 3) {
            System.out.println("=================");
            //开始挑战boss
            ko = hero.koBoss();
            while (true) {
                if (ko == -1) {
                    //挑战失败,恢复待初始状态
                    hero.restoreFromMemento(caretaker.getMemento());
                    cnt += 1;
                    break;
                }else if(ko == 0){
                    //继续挑战
                    ko = hero.koBoss();
                }else if(ko == 1){
                    //挑战成功
                    break;
                }
            }
        }
    }
}
