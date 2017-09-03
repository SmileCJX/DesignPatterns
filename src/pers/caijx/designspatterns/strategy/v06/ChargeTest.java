package pers.caijx.designspatterns.strategy.v06;

/**
 * Created by Administrator on 2017/9/3/003.
 */
public class ChargeTest {

    public static void main(String[] args){
        CashContext cashContext = new CashContext(DiscountEnum.FULL300MIN100);
        System.out.println(cashContext.getResult(600));
    }
}
