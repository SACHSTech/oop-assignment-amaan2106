package School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

        public static void main(String[] args) throws IOException {
            

            Teacher Jenny = new Teacher("Hellar", "Jenny", "Female", 40, "Math", 20, 50000.0);
            Student James = new Student("James", "Smith", "Male", 15, 4.0, 10);
            Student Ali = new Student("Ali", "Bob", "Male", 16, 3.6, 11);
            Principal Young = new Principal("Joe", "Young", "Male", 50, 100000000, 20);
            School StAugustine = new School();
            
            StAugustine.addStudents(James);
            StAugustine.addStudents(Ali);
            StAugustine.addTeachers(Jenny);
            StAugustine.addPrincipals(Young);

           
            System.out.println(" ");
            System.out.println("Welcome to St Augusting CHS");
            System.out.println("Teachers: ");
            System.out.println(StAugustine.getTeacherSize() + " Teachers ");
            System.out.println(StAugustine.getPrincipalSize() + " Principals ");
            System.out.println(StAugustine.getStudentSize() + " Students");
            System.out.println("Please enter the number for the type of person you want to see");
            
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                System.out.println("");
                System.out.println("");
                System.out.println("1. Teachers");
                System.out.println("2. Students");
                System.out.println("3. Principal");
                System.out.println("Enter any other key to exit");
                String choice = keyboard.readLine();
                if (choice.equals("1")){
                    StAugustine.printTeacherList();
                } else if (choice.equals("2")){
                    StAugustine.printStudentList();
                } else if (choice.equals("3")){
                    StAugustine.printPrincipalList();
                } else{
                    System.out.println("Thank you for coming to St Augustine CHS!");
                    break;
                }
            }
        }
    }
