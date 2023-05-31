import java.util.ArrayList;
import java.util.List;

public class StudentHandler {
    private List<Student> student;

    public StudentHandler() {
        student = new ArrayList<>();
    }

    public void addStudent(Student studentexpm){
        student.add(studentexpm);
    }
    public float getAverage(){
        float average = 0;
        int numberofstudents = 0;
        for(Student x : student){
           average = average + x.getGrade();
           numberofstudents++;
        }
        average = average/numberofstudents;
        return average;
    }

    public List<Student> getStudents(int grade){
        List<Student> ListofStudentsWithThatGrade = new ArrayList<>();
        for(Student x : student){
            if(grade==x.getGrade()){
                ListofStudentsWithThatGrade.add(x);
            }
        }
        return ListofStudentsWithThatGrade;
    }

    public List<Student> PrintHighest(){
        List<Student> HigestGradeStudents = new ArrayList<>();

        for(Student x : student){
            if(x.getGrade()==12){
                HigestGradeStudents.add(x);
            }
            if()
        }
    }

}
