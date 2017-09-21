package pers.caijx.designspatterns.factory.v03;

/**
 * Created by Administrator on 2017/9/21/021.
 */
public class Main {

    public static void main(String[] args){
        LeiFeng xueleifeng = new UnderGraduate();
        xueleifeng.swap();
        xueleifeng.wash();
        xueleifeng.buyRice();
    }
}
