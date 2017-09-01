package pers.caijx.designspatterns.strategy.v04;

/**
 * Created by Administrator on 2017/8/31/031.
 */
public class StrategyTest {

    public static void main(String[] args){
        //由于实例化不同的策略，所以最终在调用context.ContextInterface()时，所获得的结果就不尽相同
        Context context = null;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
