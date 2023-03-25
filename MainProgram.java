class Student {
    String firstName;
    String lastName;
    double gpa;
    String major;
    int age;
    boolean onProbation;
    String sex;
    int id;
}

public class MainProgram {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        
        student1.firstName = "Angel";
        student1.lastName = "Alvarez";
        student1.gpa = -0.23;
        student1.major = "Computer Science";
        student1.age = 20;
        student1.onProbation = true;
        student1.sex = "Male";
        student1.id = 1;

        student2.firstName = "Jeffrey";
        student2.lastName = "Winters";
        student2.gpa = 3.22;
        student2.major = "Biology";
        student2.age = 21;
        student2.onProbation = false;
        student2.sex = "Male";
        student2.id = 2;

        printStudentInfo(student1);
        printStudentInfo(student2);
    }
    
    public static void printStudentInfo(Student student) {
        System.out.println("\nid: " + student.id);
        System.out.println("name: " + student.firstName + " " + student.lastName);
        System.out.println(student.major + " student");
        System.out.println("GPA: " + student.gpa);
        System.out.println(student.age + " years old");
        System.out.println(student.sex);
        System.out.println((student.onProbation == true ? "on probation" : "not on probation\n"));
    }
}
