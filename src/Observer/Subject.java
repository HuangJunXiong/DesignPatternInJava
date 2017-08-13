package Observer;

/**
 * Created by huangjunxiong on 2017/8/13.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
