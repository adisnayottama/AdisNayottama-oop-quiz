package id.ac.polinema.oop;

public class Cashier {

    public double calculateChange(Order order, double cash) {
        return cash - order.getFinalTotal();
    }
}