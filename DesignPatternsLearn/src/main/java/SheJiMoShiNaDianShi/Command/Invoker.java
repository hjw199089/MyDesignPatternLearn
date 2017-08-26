package SheJiMoShiNaDianShi.Command;

/**
 * Created by hjw on 16/9/14.
 *
 * 创建消息发送者
 *
 */
public class Invoker {

    private IPost post;


    public void setPost(IPost post) {
        this.post = post;
    }

    public void postMail(String message){
        System.out.println("发信人向邮局投递信件");
        this.post.sendMail(message);
    }

}
