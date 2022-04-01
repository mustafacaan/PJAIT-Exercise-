/*package LinkedList;

public class Student {
    private String name;
    private int id;
    static int ID = 1;

    public Student(String name, int id) {
        this.name = name;
        this.id = ID++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String toString(){
        return name + " " + id;
    }
}
class StudNode{
    private Student student;
    private StudNode next;
    public StudNode(Student student,StudNode next){
        this.student = student;
        this.next = next;
    }
    public StudNode(Student student) {
       this(student ,null);
    }
    public Student getStudent(int id){
       StudNode tmp = head;
       while (tmp.next!=null){
           if (tmp.getStudent().getId()==id){
               return tmp.getStudent();
       }

    }
}
class StudGroup{
    private String groupName;
    private StudNode head;
    public StudGroup(String groupName,StudNode head){
        this.groupName = groupName;
        this.head = head;
    }
    public StudGroup(String groupName){
        this(groupName, null);
    }
    public String getName(){
        return groupName;
    }
    public void addFront(Student s){

    }
}
public class Main{
    public static void main(String[] args){
        new Student(new Student()){

        }
    }
}


 */