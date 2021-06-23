package School;
public class Human {
    
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Human (String fName, String lName, String Gender, int Age ){
        firstName = fName;
        lastName = lName;
        gender = Gender;
        age = Age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
