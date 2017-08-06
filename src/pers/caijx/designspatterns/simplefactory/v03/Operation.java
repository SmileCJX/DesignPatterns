package pers.caijx.designspatterns.simplefactory.v03;

/**
 * Created by Administrator on 2017/8/6/006.
 */
public class Operation {

    public static double getResult( double numberA, double numberB, String oper ){
        double result = 0.0;
        switch ( oper ){
            case "+" :
                result = numberA + numberB;
                break;
            case "-" :
                result = numberA - numberB;
                break;
            case "*" :
                result = numberA * numberB;
                break;
            case "/" :
                if( numberB != 0 ){
                    result = numberA / numberB;
                } else {
                    System.out.println( "除数不能为0！" );
                }
                break;
            default :
                System.out.println("运算符号不正确！！！");
        }
        return result;
    }
}
