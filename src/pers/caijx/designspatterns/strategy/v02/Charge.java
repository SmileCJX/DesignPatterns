package pers.caijx.designspatterns.strategy.v02;


/**
 * Created by Administrator on 2017/8/31/031.
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

    public double cacuPrice(double price,double mount,DiscountEnum discountEnum){
        switch (discountEnum){
            case NORMAL:
                total = price * mount * 1;
                break;
            case OFF50:
                total = price * mount * 0.5;
                break;
            case OFF30:
                total = price * mount * 0.7;
                break;
            case OFF20:
                total = price * mount * 0.8;
                break;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "total=" + total +
                '}';
    }
}
