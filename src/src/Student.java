import java.util.ArrayList;
import java.util.List;

public class Student extends People {
    int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


}
