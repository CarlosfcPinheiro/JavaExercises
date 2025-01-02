package TodoList;


public class Main {
    public static void main(String[] args){
        TasksList list = new TasksList();

        Task task1 = new Task("Wash dishes", 3, Status.PENDING);
        Task task2 = new Task("Clean my room", 2, Status.PENDING);
        Task task3 = new Task("Finalize java project", 1, Status.OK);

        list.add(task1);
        list.add(task2);
        list.add(task3);

        list.showAllTasks();

        System.out.println("Total task's quantity: " + list.size());

        list.getFirst().markAsDone();
        list.showTasks(true);

        list.sortTasks();
    }
}
