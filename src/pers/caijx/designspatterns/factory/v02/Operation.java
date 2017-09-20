package pers.caijx.designspatterns.factory.v02;

/**
 * 运算类
 */
public class Operation {

    private double numberA = 0.0;

    private double numberB = 0.0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult(){
        double result = 0.0;
        return result;
    }
}
