package pers.caijx.designspatterns.strategy.v05;

/**
 * Created by Administrator on 2017/8/31/031.
 */
//返利收费子类
public class CashReturn implements CashSuper {

    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition){
            result = money - ((int)(money/moneyCondition) * moneyReturn);
        }

        return result;
    }

    @Override
    public String toString() {
        return "CashReturn{" +
                "moneyCondition=" + moneyCondition +
                ", moneyReturn=" + moneyReturn +
                '}';
    }
}
