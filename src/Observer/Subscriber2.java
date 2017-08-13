package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by huangjunxiong on 2017/8/13.
 */
public class Subscriber2 implements Observer {
    private Observable observable;
    private String context;
    public Subscriber2(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Newspaper2) {
            this.context = ((Newspaper2) o).getContext(); // 这里采用的拉的方式
            System.out.println("这里是订阅者1,今天收到的报纸内容是:"+ this.context);
        }
    }

    public void removeSubscriber(){
        this.observable.deleteObserver(this);
    }

    public void subscriber(){
        this.observable.addObserver(this);
    }
}
