public class Main {
    public static void main(String[] args){
        LibraryManagementSystem library = new LibraryManagementSystem();

        //Add books
        library.addBook(new Book(1001, "John Doe", "Learn Java"));
        library.addBook(new Book(1002, "Jane Doe", "Learn Advanced Java"));
        library.addBook(new Book(1003, "example1", "example01"));

        System.out.println("Books are added.");

        //Display Books
        System.out.println("Library Books: ");
        library.viewBook();

        //Update Book
        library.updateBook("Example2", "Example02", 1003);
        System.out.println("Book is updated.");

        //Display Books
        System.out.println("Library Books: ");
        library.viewBook();

        //Delete Book
        library.deleteBook(1003);
        System.out.println("Book is deleted.");

        //Display Books
        System.out.println("Library Books: ");
        library.viewBook();





    }
}
