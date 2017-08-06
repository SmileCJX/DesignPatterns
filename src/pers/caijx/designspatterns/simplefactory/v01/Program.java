package pers.caijx.designspatterns.simplefactory.v01;

import java.util.Scanner;

/**
 * 使用java作为面向对象语言实现一个计算机控制程序，要求输入两个数和运算程序，得到结果。
 * Created by Administrator on 2017/8/6/006.
 */
public class Program {
    public static  void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "请输入数字A：" );
        Double a = scanner.nextDouble();   //  错误1： 使用a,b,c,d,e这样的命名不规范
        System.out.println("请选择运算符号(+ - * /)：" );
        String b = scanner.next();
        System.out.println("请输入数字C：" );
        Double c = scanner.nextDouble();

        Double e = 0.0;
        //  错误2： 判断分支，意味着每个条件都要做判断，等于计算机做了三次无用功
        if( b.equals("+") ){  //  规范：把 ”字符串常量” 放在equals()前面，避免空指针异常
            e = a + c;
        }
        if( b.equals("-") ){
            e = a - c;
        }
        if( b.equals("*") ){
            e = a * c;
        }
        //  错误3： 如果除数时，客户输入了0怎么处理，如果用户输入的是字符符号而不是数字怎么办
        if( b.equals("/") ){
            e = a / c;
        }

        System.out.println( e );

    }
}
