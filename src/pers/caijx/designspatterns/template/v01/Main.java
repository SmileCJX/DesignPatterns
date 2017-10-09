package pers.caijx.designspatterns.template.v01;

/**
 * Created by Administrator on 2017/10/9/009.
 */
public class Main {

    public static void main(String[] args){

        System.out.println("学生A作答：");
        TestPaperA testPaperA = new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        System.out.println("学生B作答：");
        TestPaperB testPaperB = new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}
