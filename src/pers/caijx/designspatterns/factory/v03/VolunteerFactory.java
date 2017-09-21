package pers.caijx.designspatterns.factory.v03;

/**
 * 社区志愿者工厂
 * Created by Administrator on 2017/9/22/022.
 */
public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
