
public class Student {
    String sname;
    int rollno;
    int age;

    Student(String sname, int rollno) {
        this(10);
       
        System.out.println("Parent class constructor non parameterised cons called");
        this.sname = sname;
        this.rollno = rollno;       
        
    }
    Student(int a) {
        this();
        System.out.println("Parent class constructor parameterised cons called with value: " + a);
    }
    Student(String sname, int rollno, int age) {
        this(sname, rollno);                //calling another constructor having two parameters Student(String sname, int rollno, int age)
                                            //we no need to again write this.sname = sname; and this.rollno = rollno;
        System.out.println("Parent class constructor with 3 parameters called");
        this.age = age;
    }
    public Student() {
        
    }

}

  class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101);
        System.out.println("Student Name: " + s1.sname + ", Roll No: " + s1.rollno);
        
        Student s2 = new Student("Alice", 102, 20);  //calling three parameter constructor
        System.out.println("Student Name: " + s2.sname + ", Roll No: " + s2.rollno + ", Age: " + s2.age);

        Student s3=new Student();// we are initiallizing object here using Stusent() constructor
    }
}
