package pers.caijx.designspatterns.strategy.v04;

/**
 * Created by Administrator on 2017/8/31/031.
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}
