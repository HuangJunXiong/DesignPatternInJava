package Observer;

/**
 * Created by huangjunxiong on 2017/8/13.
 */
public class Test {
    public static void main(String args[]){
        Newspaper n = new Newspaper();
        Subscriber s = new Subscriber(n);
        String str1 = "今天是8月1号,发生了xxxx事情...";
        n.updateContext(str1);
        String str2 = "今天是8月2号,发生了XXXX事情...";
        n.updateContext(str2);
        String str3 = "今天是8月3号,发生了XXXXXXX事情...";
        n.removeObserver(s); //取消订阅
        n.updateContext(str3);
        String str4 = "今天是8月4号,发生了xxxxxx事情...";
        n.registerObserver(s); //订阅
        n.updateContext(str4);
    }
}
