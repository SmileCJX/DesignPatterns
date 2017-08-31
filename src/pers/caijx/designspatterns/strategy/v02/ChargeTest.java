package pers.caijx.designspatterns.strategy.v02;

/**
 * Created by Administrator on 2017/8/31/031.
 */
public class ChargeTest {

    public static void main(String[] args){
        Charge charge = new Charge();
        System.out.println(charge.cacuPrice(20,3, DiscountEnum.OFF30));
    }
}
