package Decorator;

/**
 * Created by huangjunxiong on 2017/9/23.
 */
public class Espresso extends Beverage {

    public Espresso(){
        desc = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
