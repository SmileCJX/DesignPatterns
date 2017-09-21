package pers.caijx.designspatterns.factory.v03;

/**
 * 学雷锋的大学生工厂
 * Created by Administrator on 2017/9/22/022.
 */
public class UndergraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new UnderGraduate();
    }
}
