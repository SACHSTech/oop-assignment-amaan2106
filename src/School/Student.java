package School;

public class Student extends Human{

    private double currentGPA;
    private int gradeLevel;

    public Student(String fName, String lName, String Gender, int Age, double currentGPA, int gradeLevel) {
        super(fName, lName, Gender, Age);
        this.currentGPA = currentGPA;
        this.gradeLevel = gradeLevel;
    }

    public double getCurrentGPA() {
        return currentGPA;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public String toString(){
        System.out.println("##################################");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Age: " + getAge());
        System.out.println("Teaching Subject: "+ getCurrentGPA() );
        System.out.println("Years of experience: "+ getGradeLevel());
        return "--------------------------------------";
    }

}