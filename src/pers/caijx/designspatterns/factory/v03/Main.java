package pers.caijx.designspatterns.factory.v03;

/**
 * Created by Administrator on 2017/9/21/021.
 */
public class Main {

    public static void main(String[] args){
        LeiFeng studentA = SimpleFactory.createFactory(GoodManEnum.STUDENT);
        studentA.buyRice();
        LeiFeng studentB = SimpleFactory.createFactory(GoodManEnum.STUDENT);
        studentB.sweep();
        LeiFeng studentC = SimpleFactory.createFactory(GoodManEnum.STUDENT);
        studentC.wash();
    }
}
