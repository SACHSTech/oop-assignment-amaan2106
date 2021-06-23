package School;

public class Janitor extends Human{

    private double salary;
    private int yearsOfExperience;

    public Janitor(String fName, String lName, String Gender, int Age, double salary, int yearsOfExperience) {
        super(fName, lName, Gender, Age);
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String toString(){
        System.out.println("##################################");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Age: " + getAge());
        System.out.println("Years of experience: "+ getYearsOfExperience());
        System.out.println("Salary: " +getSalary());
        return "--------------------------------------";
    }
}
