package pers.caijx.designspatterns.prototype.v01;

/**
 * 简历
 * Created by Administrator on 2017/9/23/023.
 */
public class Resume {

    private String name;

    private String sex;

    private String age;

    private String timeArea;

    private String company;

    public Resume(String name) {
        this.name = name;
    }

    //设置个人信息
    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    //显示
    public void display(){
        System.out.printf("%s %s %s\n",name,sex,age);
        System.out.printf("%s %s\n",timeArea,company);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
