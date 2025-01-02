package TodoList;

import java.time.LocalDateTime;

public class Task implements Comparable<Task>{
    private String description;
    private final int priority;
    private final LocalDateTime creationDate;
    private Status status;

    Task(String description, int priority, Status status){
        this.description = description;
        this.priority = priority;
        // Consumes an external API to get current datetime
        this.creationDate = LocalDateTime.now();
        this.status = status;
    }

    public void markAsDone(){
        if(this.status==Status.OK){
            System.out.println("This task is already marked as done!");
        }
        else{
            this.status = Status.OK;
        }
    }

    @Override
    public int compareTo(Task other){
        return Integer.compare(this.getPriority(), other.getPriority());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreationDate(){
        return creationDate;
    }

    @Override
    public String toString(){
        return "Task{\n"+
                "title = "+this.description+"\n"+
                "description = "+this.description+"'\n"+
                "creationDate = "+this.creationDate.toString()+",\n"+
                "priority = "+this.priority+",\n"+
                "status = "+this.status.getStatus()+"\n"+
                "}";
    }
}