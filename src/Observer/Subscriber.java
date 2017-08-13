package Observer;

/**
 * Created by huangjunxiong on 2017/8/13.
 */
public class Subscriber implements Observer {
    private String context;
    private Subject subject;
    public Subscriber(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(String context) {
        this.context = context;
        System.out.println("这里是订阅者1,今天收到的报纸内容是:"+context);
    }
}
