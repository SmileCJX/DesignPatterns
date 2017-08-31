package pers.caijx.designspatterns.strategy.v03;

/**
 * Created by Administrator on 2017/8/31/031.
 */
public class ChargeTest {

    public static void main(String [] args){
        CashSuper cashSuper = CashFactory.createCashAccept(DiscountEnum.FULL300MIN100);
        double totalPrice = 1000.0;
        System.out.println(cashSuper.acceptCash(totalPrice));
    }
}
