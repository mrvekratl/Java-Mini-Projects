public class Book {
    private int isbn;
    private String author;
    private String title;

    public Book(int isbn, String author, String title){
        this.author = author;
        this.isbn = isbn;
        this.title = title;
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
    @Override
    public String toString(){
        return "ISBN: " + this.isbn + ", Title: " + this.title + ", Author: " + this.author;
    }
}
