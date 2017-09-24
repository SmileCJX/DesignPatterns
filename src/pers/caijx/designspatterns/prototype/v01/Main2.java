package pers.caijx.designspatterns.prototype.v01;

/**
 * 传引用，未传值
 * Created by Administrator on 2017/9/24/024.
 */
public class Main2 {

    public static void main(String[] args){

        Resume resume1 = new Resume("大鸟");
        resume1.setPersonalInfo("男","29");
        resume1.setWorkExperience("1998-2000","xx公司");

        Resume resume2 = resume1;
        Resume resume3 = resume1;

        resume1.display();
        resume2.display();
        resume3.display();
    }
}
