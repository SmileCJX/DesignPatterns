package pers.caijx.designspatterns.simplefactory.v04;

/**
 * 使用简单工厂模式
 * Created by Administrator on 2017/8/6/006.
 */
public class Program {
    public static void main(String args[]){
        Operation oper = null;
        oper = OperationFactory.createOperate("/");
        oper.setNumberA( 20 );
        oper.setNumberB( 0 );;
        double result = oper.getResult();
        System.out.println(result);
    }
}
