import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student Anders = new Student("Anders",10);
        People Anders3 = new Student("Anders", 7);
        Student Anders2 = new Student("Anders",10);
        Student Noah = new Student("Noah", 7);
        Student Morten = new Student("Morten", 12);
        StudentHandler studentHandler = new StudentHandler();
        studentHandler.addStudent(Anders);
        studentHandler.addStudent(Anders2);
        studentHandler.addStudent(Noah);
        studentHandler.addStudent(Morten);
        System.out.println(Anders.getGrade());
        System.out.println(studentHandler.getAverage());
        //List<Student> ListOfStudentsWithThatGrade = new ArrayList<>();
        List<Student> ListOfStudentsWithThatGrade = studentHandler.getStudents(10);
        for(Student x : ListOfStudentsWithThatGrade){
            System.out.println(x.getName());
        }



    }
}