package School;

public class Teacher extends Human {

    private String teachingSubject;
    private int yearsOfExperience;
    private double salary;

    public Teacher(String fName, String lName, String Gender, int Age, String teachingSubject, int yearsOfExperience, double salary) {
        super(fName, lName, Gender, Age);
        this.teachingSubject = teachingSubject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        System.out.println("##################################");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Age: " + getAge());
        System.out.println("Teaching Subject: "+ getTeachingSubject() );
        System.out.println("Years of experience: "+ getYearsOfExperience());
        System.out.println("Salary: " +getSalary());
        return "--------------------------------------";
    }


}