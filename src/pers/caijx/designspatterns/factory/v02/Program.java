package pers.caijx.designspatterns.factory.v02;

/**
 * Created by Administrator on 2017/9/21/021.
 */
public class Program {

    public static void main(String[] args){
        IFactory operFactory = new AddFactory();
        Operation operation = operFactory.createOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
