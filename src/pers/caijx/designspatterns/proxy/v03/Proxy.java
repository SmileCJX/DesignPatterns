package pers.caijx.designspatterns.proxy.v03;

/**
 * Created by Administrator on 2017/9/8/008.
 */
public class Proxy implements IGiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        this.pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChoolate() {
        pursuit.giveChoolate();
    }
}
