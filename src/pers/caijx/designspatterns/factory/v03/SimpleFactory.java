package pers.caijx.designspatterns.factory.v03;

/**
 * Created by Administrator on 2017/9/21/021.
 */
public class SimpleFactory {

    public static LeiFeng createFactory(GoodManEnum goodManEnum){
        LeiFeng result = null;
        switch (goodManEnum){
            case STUDENT:
                result = new UnderGraduate();
                break;
            case VOLUNTEER:
                result = new Volunteer();
                break;
            default:
        }
        return result;
    }
}
