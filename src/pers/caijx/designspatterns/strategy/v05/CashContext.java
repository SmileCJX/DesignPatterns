package pers.caijx.designspatterns.strategy.v05;

/**
 * Created by Administrator on 2017/9/3/003.
 */
public class CashContext {

    private CashSuper cashSuper;

    /**
     * 通过构造方法，传入具体的收费策略
     * @param cashSuper
     */
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
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
