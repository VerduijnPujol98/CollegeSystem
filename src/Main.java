//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Teacher teacher = new Teacher("Dr.", "Asuka","Verduijn");

    Course course = new Course(new char[]{'1','2','3'},3,2,teacher);

    System.out.println(course.getTeacherName());

}
