import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addStudent(Student student){
        if(students.contains(student)){
            System.out.println("This student aldready exists.");
            return;
        }
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Surname: ");
        String surname = scanner.nextLine();

        student.setNameSurname(name,surname);
        student.setStudentNumber(students.size() + 1);

        students.add(student);
    }
    public void viewStudents(){
        System.out.println("Student Name Surname\t\tStudent Number");
        students.forEach(System.out::println);
    }


}
