package pers.caijx.designspatterns.simplefactory.v02;

import java.util.Scanner;

/**
 * 针对版本1做出改进
 * Created by Administrator on 2017/8/6/006.
 */
public class Program {
    public static void  main(String  args[]){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println( "请输入数字numberA：" );
            Double numberA = scanner.nextDouble();
            System.out.println("请选择运算符号(+ - * /)：" );
            String oper = scanner.next();
            System.out.println("请输入数字numberB：" );
            Double numberB = scanner.nextDouble();

            Double result = 0.0;

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

            System.out.println( "结果是：" + result );
        } catch (Exception e){
            e.printStackTrace();
            System.err.println( "您的输入有错：" + e.getMessage() );
        }

    }
}
