package pers.caijx.designspatterns.strategy.v01;

/**
 * Created by Administrator on 2017/8/30/030.
 */
public class Charge {

    private double total = 0.0d;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double cacuPrice(double price,double mount){

        total = price * mount;

        return total;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "total=" + total +
                '}';
    }
}
