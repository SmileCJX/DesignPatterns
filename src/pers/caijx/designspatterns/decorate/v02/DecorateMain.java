package pers.caijx.designspatterns.decorate.v02;

import pers.caijx.designspatterns.decorate.v02.domain.Person;
import pers.caijx.designspatterns.decorate.v02.wear.*;

/**
 * Created by Administrator on 2017/9/3/003.
 */
public class DecorateMain {

    public static void main(String[] args){
        Person person = new Person("小菜");
        System.out.println("第一种装扮: ");
        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneakers();
        dtx.show();
        kk.show();
        pqx.show();
        person.show();

        System.out.println("第二种装扮: ");
        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();
        xz.show();
        ld.show();
        px.show();
        person.show();
    }
}
