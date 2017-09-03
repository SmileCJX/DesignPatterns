package pers.caijx.designspatterns.strategy.v05;

/**
 * Created by Administrator on 2017/9/3/003.
 */
public class ChargeTest {

    public static void main(String[] args){
        CashContext cashContext = null;

        DiscountEnum discountEnum = DiscountEnum.FULL300MIN100;
        switch (discountEnum){
            case NORMAL:
                cashContext = new CashContext(new CashNormal());
                break;
            case FULL300MIN100:
                cashContext = new CashContext(new CashReturn(300,100));
                break;
            case OFF20:
                cashContext = new CashContext(new CashRebate(0.8));
                break;

        }
        double totalPrices = 0.0;
        //通过对Context的GetResult方法的调用，可以得到收取费用的结果，让具体算法与客户进行了隔离
        totalPrices = cashContext.getResult(600);
        System.out.println(totalPrices);
    }
}
