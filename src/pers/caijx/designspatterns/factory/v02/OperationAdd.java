package pers.caijx.designspatterns.factory.v02;

/**
 * 加法类，继承运算类
 * Created by Administrator on 2017/8/6/006.
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}
