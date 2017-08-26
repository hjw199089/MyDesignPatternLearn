package DesignPatterns.Builder;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hjw on 16/8/25.
 */
public class Builder {

    private List<Sender> list = new ArrayList();

    public void produceMailSender(int count) {
        for (int i = 0; i <= count; i++) {
            list.add( new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i <= count; i++){
            list.add( new SmsSender());
        }
    }


    public List<Sender> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "list=" + list +
                '}';
    }
}
