package pers.caijx.designspatterns.strategy.v03;

/**
 * Created by Administrator on 2017/8/31/031.
 */
//打折收费子类
public class CashRebate implements CashSuper{

    private double moneyRebate = 1D;

    public double getMoneyRebate() {
        return moneyRebate;
    }

    public void setMoneyRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    //打折收费率，初始化时，必需要输入折扣率，如八折，就是0.8
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

    @Override
    public String toString() {
        return "CashRebate{" +
                "moneyRebate=" + moneyRebate +
                '}';
    }
}
