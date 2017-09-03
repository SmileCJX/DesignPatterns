package pers.caijx.designspatterns.decorate.v01;

/**
 * Created by Administrator on 2017/9/3/003.
 */
public class DecorateMain {

    public static void main(String[] args){
        Person person = new Person("小菜");
        System.out.println("第一种装扮: ");
        person.wearTShirts();
        person.wearBigTrouser();
        person.wearSneakers();
        person.show();

        System.out.println("第二种装扮: ");
        person.wearSuit();
        person.wearTie();
        person.wearLeatherShoes();
        person.show();
    }
}
