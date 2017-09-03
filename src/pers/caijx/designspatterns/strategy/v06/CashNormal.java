package pers.caijx.designspatterns.strategy.v06;

import pers.caijx.designspatterns.strategy.v06.CashSuper;

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
