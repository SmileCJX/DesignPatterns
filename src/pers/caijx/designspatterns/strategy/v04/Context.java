package pers.caijx.designspatterns.strategy.v04;

/**
 * Created by Administrator on 2017/8/31/031.
 */
public class Context {

    private Strategy strategy;

//    初始化时，传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //根据具体的策略对象，调用其算法的方法
    public void ContextInterface(){
        strategy.algorithmInterface();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
