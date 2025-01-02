package TodoList;

public enum Status {
    OK("Ok"),
    PENDING("Pending");

    private String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
