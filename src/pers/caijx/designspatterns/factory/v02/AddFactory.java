package pers.caijx.designspatterns.factory.v02;

/**
 * Created by Administrator on 2017/9/21/021.
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
