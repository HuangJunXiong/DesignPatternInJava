package Factory.Abstract;

/**
 * Created by lenovo on 2017/6/4.
 */
public abstract class Pizza {
    String name; // 名称
    String location; //地区
    String material; // 材料
    String practice; // 做法
    abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
