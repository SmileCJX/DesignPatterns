package pers.caijx.designspatterns.proxy.v03;

/**
 * Created by Administrator on 2017/9/8/008.
 */
public class Main {

    public static void main(String[] args){
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("晓清");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();  //通过代理人得到礼物，但是不认识追求她的人
        proxy.giveFlowers();
        proxy.giveChoolate();
    }
}
