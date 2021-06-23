package School;

import java.util.ArrayList;

public class School {
    private ArrayList<Janitor> Janitors;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student > students;


    public School(){
        Janitors = new ArrayList<Janitor>();
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
    }

    public void addStudents (Student newStudent){
        students.add(newStudent);
    }

    public void addTeachers(Teacher newTeacher){
        teachers.add(newTeacher);
    }

    public void addJanitors(Janitor newJanitor){
        Janitors.add(newJanitor);
    }

    public int getJanitorSize(){
        return Janitors.size();
    }

    public int getStudentSize(){
        return students.size();
    }

    public int getTeacherSize(){
        return teachers.size();
    }

    public void printJanitorList(){
        for(int i = 0; i < getJanitorSize(); i++){
            System.out.println(Janitors.get(i));
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
