package pers.caijx.designspatterns.simplefactory.v03;

import java.util.Scanner;

/**
 * 让业务逻辑与界面逻辑分开，让它们之间的耦合度下降，才可以达到容易维护或扩展。
 * Created by Administrator on 2017/8/6/006.
 */
public class Program {
    public static void  main(String  args[]){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println( "请输入数字numberA：" );
            Double numberA = scanner.nextDouble();
            System.out.println( "请选择运算符号(+ - * /)：" );
            String oper = scanner.next();
            System.out.println( "请输入数字numberB：" );
            Double numberB = scanner.nextDouble();

            Double result = 0.0;
            result = Operation.getResult( numberA, numberB, oper );
            System.out.println( result );
        } catch (Exception e){
            e.printStackTrace();
            System.err.println( "您的输入有错：" + e.getMessage() );
        }

    }
}
