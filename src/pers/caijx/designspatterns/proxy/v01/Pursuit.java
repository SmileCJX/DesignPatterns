package pers.caijx.designspatterns.proxy.v01;

/**
 * Created by Administrator on 2017/9/7/007.
 */

/**
 * 追求者
 */
public class Pursuit {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    public void giveDolls(){
        System.out.println(schoolGirl.getName() + " 送你洋娃娃");
    }

    public void giveFlowers(){
        System.out.println(schoolGirl.getName() + " 送你鲜花");
    }

    public void giveChocolate(){
        System.out.println(schoolGirl.getName() + " 送你巧克力");
    }

    @Override
    public String toString() {
        return "Pursuit{" +
                "schoolGirl=" + schoolGirl +
                '}';
    }
}
