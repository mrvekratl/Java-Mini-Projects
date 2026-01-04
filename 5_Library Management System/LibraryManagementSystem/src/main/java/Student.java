import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int studentNum;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Student(String name, String surname, int studentNum){
        this.name = name;
        this.surname = surname;
        this.studentNum = studentNum;
    }
    public String getNameSurname(){
        return this.name + this.surname;
    }
    public void setNameSurname(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public void setStudentNumber(int number){
        this.studentNum = number;
    }
    public List<Book> getBorrowedBooks(){
        return this.borrowedBooks;
    }
    @Override
    public String toString(){
        return  this.name +" "+ this.surname + "\t\t" + this.studentNum;
    }
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(object instanceof Student)){
            return false;
        }

        Student comparedObject = (Student) object;

        return this.studentNum == comparedObject.studentNum && this.name.equals(comparedObject.name) && this.surname.equals(comparedObject.surname);
    }
    @Override
    public int hashCode(){
        return Objects.hash(studentNum, name, surname);
    }
}
