package SheJiMoShiNaDianShi.Command;

/**
 * Created by hjw on 16/9/14.
 */
public class Client {


    public static void main(String[] args) {

        IReceiver receiver = new Receiver();

        IPost post = new Post(receiver);


        Invoker invoker = new Invoker();

        invoker.setPost(post);
        invoker.postMail("你好,好久不见");
    }
}
