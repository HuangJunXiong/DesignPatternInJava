package Observer;

import java.util.Observable;

/**
 * Created by huangjunxiong on 2017/8/13.
 */
public class Newspaper2 extends Observable {
    private String context;
    public Newspaper2(){}
    public void updateContext(String context){
        this.context = context;
        setChanged(); // 通知前调用指示状态发生了改变
        notifyObservers();
    }

    public String getContext() {
        return context;
    }
}
