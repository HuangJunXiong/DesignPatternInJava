package Decorator;

/**
 * Created by huangjunxiong on 2017/9/24.
 */
public class Test {
    public static void main(String args[]){
        Beverage beverage = new Espresso();
        System.out.println("no Condiment : "+ beverage.getDesc() + " | total : $" + beverage.cost());

        Beverage beverage1 = new Mocha(new Espresso());
        System.out.println("have Mocha : " + beverage1.getDesc() + " | total : $" + beverage1.cost());

        Beverage beverage2 = new Milk(new Mocha(new Espresso()));
        System.out.println("have Milk,Mocha : " + beverage2.getDesc() + " | total : $" + beverage2.cost());
    }
}
