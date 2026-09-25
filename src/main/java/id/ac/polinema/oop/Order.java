package id.ac.polinema.oop;

public class Order {
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new OrderItem[10];
        this.itemCount = 0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addItem(MenuItem item, int quantity) {
        if (itemCount < items.length) {
            this.items[itemCount] = new OrderItem(item, quantity);
            itemCount++;
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getSubtotal();
        }
        return total;
    }

    public double getFinalTotal() {
        double total = getTotal();
        if (total >= 100000) {
            return total * 0.90; // Diskon 10%
        }
        return total;
    }
}