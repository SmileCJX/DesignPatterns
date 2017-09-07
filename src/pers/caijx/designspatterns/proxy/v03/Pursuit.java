package pers.caijx.designspatterns.proxy.v03;

/**
 * Created by Administrator on 2017/9/8/008.
 */

/**
 * 追求者实现送礼物接口
 */
public class Pursuit implements IGiveGift{

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + " 送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + " 送你鲜花");
    }

    @Override
    public void giveChoolate() {
        System.out.println(schoolGirl.getName() + " 送你巧克力");
    }
}
