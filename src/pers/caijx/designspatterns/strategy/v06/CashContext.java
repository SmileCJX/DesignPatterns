package pers.caijx.designspatterns.strategy.v06;

/**
 * Created by Administrator on 2017/9/3/003.
 */
public class CashContext {

    private CashSuper cashSuper;

    /**
     * 参数不是具体的收费策略对象，而是枚举类型，表示收费类型
     * @param discountEnum
     */
    public CashContext(DiscountEnum discountEnum) {
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
    }

    /**
     * 根据收费策略的不同，获得计算结果
     * @param money
     * @return
     */
    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
