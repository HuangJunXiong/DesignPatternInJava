package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangjunxiong on 2017/8/13.
 */
public class Newspaper implements Subject {
    private List<Observer> list;
    private String context;
    public Newspaper() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = list.indexOf(o);
        if (i >= 0) {
            list.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        if (list!=null && list.size()>0){
            for (Observer o : list){
                o.update(this.context);
            }
        }
    }

    public void updateContext(String context){
        this.context = context;
        notifyObserver(); // 有更新就通知
    }
}