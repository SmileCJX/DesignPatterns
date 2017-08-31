package pers.caijx.designspatterns.strategy.v03;

/**
 * Created by Administrator on 2017/8/31/031.
 */
//现金收费工厂类
public class CashFactory {

    public static CashSuper createCashAccept(DiscountEnum discountEnum){
        CashSuper cashSuper = null;

        switch (discountEnum){
            case NORMAL:
                cashSuper = new CashNormal();
                break;
            case FULL300MIN100:
                cashSuper = new CashReturn(300,100);
                break;
            case OFF20:
                cashSuper = new CashRebate(0.8);
                break;
        }

        return cashSuper;
    }
}
