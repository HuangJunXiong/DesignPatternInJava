package Decorator;

/**
 * Created by huangjunxiong on 2017/9/23.
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        desc = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
