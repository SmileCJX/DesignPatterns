package pers.caijx.designspatterns.factory.v01;

/**
 * 使用简单工厂模式
 * Created by Administrator on 2017/8/6/006.
 */
public class Program {
    public static void main(String args[]){
        Operation oper = null;
        oper = OperationFactory.createOperate("+");
        oper.setNumberA( 1 );
        oper.setNumberB( 2 );;
        double result = oper.getResult();
        System.out.println(result);
    }
}
