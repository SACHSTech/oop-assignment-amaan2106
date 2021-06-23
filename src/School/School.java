package School;

import java.util.ArrayList;

public class School {
    private ArrayList<Principal> principals;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student > students;


    public School(){
        // initialize all the lists for the objects
        principals = new ArrayList<Principal>();
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
    }



    public void addStudents (Student newStudent){
        students.add(newStudent);
    }

    public void addTeachers(Teacher newTeacher){
        teachers.add(newTeacher);
    }

    public void addPrincipals(Principal newPrincipal){
        principals.add(newPrincipal);
    }

    public int getPrincipalSize(){
        return principals.size();
    }

    public int getStudentSize(){
        return students.size();
    }

    public int getTeacherSize(){
        return teachers.size();
    }

    public void printPrincipalList(){
        for(int i = 0; i < getPrincipalSize(); i++){
            System.out.println(principals.get(i));
        }
    }


    public void printTeacherList(){
        for(int i = 0; i < getTeacherSize(); i++){
            System.out.println(teachers.get(i));
        }
    }


    public void printStudentList(){
        for(int i = 0; i < getStudentSize(); i++){
            System.out.println(students.get(i));
        }
    }
}
