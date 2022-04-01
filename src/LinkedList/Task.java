package LinkedList;

public class Task {
    public String d;
    public Task n;

    public Task(String d, Task n){
        this.d = d;
        this.n = n;
    }

    public Task(String d){
        this.n=null;
        this.d=d;
    }

    public void setNextTask(Task t){
        n=t;

    }
    public void printTasks() {
        Task current = n;
        while (current != null) {
            System.out.print(current.d + " ");
            current = current.n;
        }
       System.out.println(" ");
    }
    public static void printTasks(Task head) {
        head.printTasks();
    }

    public void printTasksRev(){
        printTasksRev(this);
    }
    public static void printTasksRev(Task head){
        if(head.n != null) {
            printTasksRev(head.n);
        }
        System.out.print(head.d+ " ");

    }
    public static void main (String[] args) {
        Task t2 = new Task("Wash the dishes!");
        Task t1 = new Task("Walk the dog!",t2);
        t2.setNextTask(new Task("Clean the room!"));
        Task head = new Task("Get rest!",t1);

        head.printTasks();
        System.out.println();
        head.printTasksRev();
        System.out.println();

        System.out.println();

        Task.printTasks(head);
        System.out.println();
        Task.printTasksRev(head);
        System.out.println();
    }
}
