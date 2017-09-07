package pers.caijx.designspatterns.proxy.v02;

/**
 * Created by Administrator on 2017/9/7/007.
 */
public class SchoolGirl {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SchoolGirl{" +
                "name='" + name + '\'' +
                '}';
    }
}
