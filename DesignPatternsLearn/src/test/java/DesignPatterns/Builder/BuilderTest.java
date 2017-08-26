package DesignPatterns.Builder;
/**
 * Created by hjw on 16/8/25.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(2);
        builder.produceSmsSender(2);
        System.out.println(builder);
    }

}
