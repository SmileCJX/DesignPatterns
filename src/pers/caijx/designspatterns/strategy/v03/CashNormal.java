package pers.caijx.designspatterns.strategy.v03;

/**
 * Created by Administrator on 2017/8/31/031.
 */
//现金收费接口
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
