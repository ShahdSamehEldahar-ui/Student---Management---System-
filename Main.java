import java.util.ArrayList;
  class Student {
    int id ;
    String name ;
    int age ;
    String department ;
    Student(int id , String name , int age , String department ) {
        this.id = id ;
        this.name = name ;
        this.age = age ;
        this.department = department ;
    }
   }
     public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        
        
        //Display all information about students 
        students.add(new Student(1,"Shahd",19,"IS"));
        students.add(new Student(2,"Ali",25,"CS"));
        for(Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.age + " " + s.department) ;
        }
        
        
        //search by Id
        int searchId = 1 ;
        System.out.println("\nsearch Result :");
        Student s = null;
        if (s.id==searchId) {
            System.out.println(s.id + " " + s.name + " " + s.age + " " + s.department);
        }
    }
              }
