package University;
public class Course {

    private String CourseName; 
    private String Instructor;
    private int NumberOfStudents;

Course(String CourseName , String Instructor , int NumberOfStudents){

this.CourseName = CourseName;
this.Instructor = Instructor;
this.NumberOfStudents =NumberOfStudents;


}
public String getCourseName() {
    return CourseName;
}

public void setCourseName(String CourseName) {
    this.CourseName = CourseName;
}
public String getInstructor() {
    return Instructor;
}

public void setInstructor(String Instructor) {
    this.Instructor = Instructor;
}
public int getNumberOfStudents() {
    return NumberOfStudents;
}

public void setNumberOfStudents(int NumberOfStudents) {
    this.NumberOfStudents = NumberOfStudents;
}


public String toString() {
    return "CourseName: " + CourseName + ", Instructor: " + Instructor + ", NumberOfStudents: " + NumberOfStudents ;
}

    
    public static void main(String[] args) throws Exception {
        

    }
    
}
