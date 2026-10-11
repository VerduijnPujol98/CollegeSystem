public class Course{
    private char[] code;
    private int maxNoStudentSeatsAvailable;
    private int Semester;
    private Teacher teacher;

    Course(char[] code, int maxNoStudentSeatsAvailable, int Semester, Teacher teacher) {
    this.maxNoStudentSeatsAvailable = maxNoStudentSeatsAvailable;
    this.Semester = Semester;
    this.code = code;
    this.teacher = teacher;

    }
    public String getTeacherName(){
        return teacher.addressedByName() + " " + teacher.getFirstName() + " " + teacher.getLastName();
    }

    public char[] getCode(){
        return code;
    }
}