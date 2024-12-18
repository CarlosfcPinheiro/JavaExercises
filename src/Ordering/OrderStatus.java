package Ordering;

public enum OrderStatus {
    PENDING("PENDING"),
    PROCESSING("PROCESSING"),
    SHIPPED("SHIPPED"),
    DELIVERED("DELIVERED");

    private String status;

    OrderStatus (String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
