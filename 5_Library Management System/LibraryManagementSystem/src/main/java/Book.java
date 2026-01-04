import java.util.Objects;
public class Book {
    private int isbn;
    private String author;
    private String title;
    private int quantity;

    public Book(int isbn, String author, String title, int quantity){
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        this.quantity = quantity;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getIsbn(){
        return this.isbn;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    public int getQuantity(){
        return this.quantity;
    }
    @Override
    public String toString(){
        return "ISBN: " + this.isbn + ", Title: " + this.title + ", Author: " + this.author + ", Quantity: " + this.quantity;
    }
    @Override
    public boolean equals(Object object){
        // if the variables are located in the same place, they're the same
        if(this == object){
            return  true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if(!(object instanceof Book)){
            return false;
        }

        // let's convert the object to a Book
        Book comparedObject = (Book) object;

        // if the instance variables of the objects are the same, so are the objects
        return this.isbn == comparedObject.isbn && this.title.equals(comparedObject.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isbn, title);
    }

}
