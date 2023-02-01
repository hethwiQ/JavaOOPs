package PowerBillingSystem;

public abstract class Rates {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
