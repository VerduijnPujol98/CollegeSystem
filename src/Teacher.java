public class Teacher extends Person
{
    private String AcademicTitle;

    Teacher(String AcademicTitle, String firstName, String lastName) {
        super(firstName, lastName);
        this.AcademicTitle = AcademicTitle;
    }


    @Override
    public String addressedByName(){
        return this.AcademicTitle;
    }
}