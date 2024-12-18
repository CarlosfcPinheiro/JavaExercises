package Ordering;

public class Main {
    public static void main(String[] args){
        Order newOrder = new Order(1, "Potato fries");
        Order Order2 = new Order(2, "Sandwich");

        newOrder.showOrderInfo();
        Order2.showOrderInfo();

        newOrder.updateStatus(OrderStatus.SHIPPED);
        Order2.updateStatus(OrderStatus.DELIVERED);

        newOrder.showOrderInfo();
        Order2.showOrderInfo();
    }
}
