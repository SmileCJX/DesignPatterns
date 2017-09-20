package pers.caijx.designspatterns.factory.v01;

/**
 * 用一个单独的类来做这个创造实例的过程。
 * Created by Administrator on 2017/8/6/006.
 */
public class OperationFactory {

    public static Operation createOperate(String operate ){
        Operation oper = null;
        switch ( operate ){
            case "+" :
                oper = new OperationAdd();
                break;
            case "-" :
                oper = new OperationSub();
                break;
            case "*" :
                oper = new OperationMul();
                break;
            case "/" :
                oper = new OperationDiv();
                break;
            default :
                System.out.println("运算符号不正确！！！");
        }
        return oper;
    }
}
