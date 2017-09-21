package pers.caijx.designspatterns.factory.v03;

/**
 * Created by Administrator on 2017/9/21/021.
 */
public enum GoodManEnum {
    STUDENT("大学生","学雷锋的大学生"),
    VOLUNTEER("志愿者","社区志愿者")
    ;

    private String type;

    private String msg;

    GoodManEnum(String type, String msg) {
        this.type = type;
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "GoodManEnum{" +
                "type='" + type + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
