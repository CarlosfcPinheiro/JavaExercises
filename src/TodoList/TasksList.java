package TodoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TasksList extends ArrayList<Task>{
    public TasksList() {
        // inherits ArrayList constructor
        super();
    }

    public void showAllTasks(){
        for (Task task : this){
            System.out.println(task.getPriority() + " | " + task.getDescription() + " | " + task.getStatus());
        }
    }

    public void showTasks(boolean onlyCompleted){
        for (Task task : this){
            if (onlyCompleted){
                if (task.getStatus()==Status.OK){
                    System.out.println(task.getPriority() + " | " + task.getDescription() + " | " + task.getStatus());
                }
            }
            else {
                if (task.getStatus()==Status.PENDING){
                    System.out.println(task.getPriority() + " | " + task.getDescription() + " | " + task.getStatus());
                }
            }
        }
    }

    public void sortTasks(){
        Collections.sort(this);
    }
}
