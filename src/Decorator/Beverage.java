package Decorator;

/**
 * Created by huangjunxiong on 2017/9/23.
 */
public abstract class Beverage {
    String desc = "UnKnown Beverage";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}
