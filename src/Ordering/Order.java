package Ordering;

public class Order {
    private final int id;
    private final String description;
    // Receives the enum type
    private OrderStatus status;

    public Order(int id, String description){
        this.id = id;
        this.description = description;
        this.status = OrderStatus.PENDING;
    }

    public void updateStatus(OrderStatus newStatus){
        this.status = newStatus;
    }

    public void showOrderInfo(){
        System.out.println("ID: " + this.id + ", Description: " + this.description + ", Status: " + this.status.getStatus());
    }
}
