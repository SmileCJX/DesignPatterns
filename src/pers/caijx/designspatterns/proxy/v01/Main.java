package pers.caijx.designspatterns.proxy.v01;

/**
 * Created by Administrator on 2017/9/7/007.
 */
public class Main {

    public static void main(String[] args){
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");
        Pursuit zhuijiayi = new Pursuit(jiaojiao);
        zhuijiayi.giveDolls();
        zhuijiayi.giveFlowers();
        zhuijiayi.giveChocolate();
    }
}
