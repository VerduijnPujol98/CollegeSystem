public class Student extends Person {
    private int number;
    private int yearInCollege;

    Student(int number, int yearInCollege, String firstName, String lastName) {
        super(firstName, lastName);
        this.number = number;
        this.yearInCollege = yearInCollege;


    }
    @Override
    public String addressedByName(){
        if (yearInCollege == 1) {
            return "Freshman";
        } else if (yearInCollege == 2) {
            return "Sophomore";
        } else if (yearInCollege == 3) {
            return "Junior";
        } else if (yearInCollege == 4) {
            return "Senior";
        }
        return "";
    }
}
