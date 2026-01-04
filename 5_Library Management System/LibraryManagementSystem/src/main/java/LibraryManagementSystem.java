import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
       if(books.contains(book)){
           System.out.println("This book aldready exists.");
           return;
       }
       books.add(book);
    }

    public void viewBook() {
//        for(int i = 0; i< books.size(); i++){
//            System.out.println(books.get(i));
//        }
        books.forEach(System.out::println);
    }

    public void updateBook(String author, String title, int isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                book.setAuthor(author);
                book.setTitle(title);
                break;
            }
        }

//        books.stream()
//                .filter(book -> book.getIsbn() == isbn)
//                .findFirst()
//                .ifPresent(book ->{
//                    book.setAuthor(author);
//                    book.setTitle(title);
//                });
    }

    public void deleteBook(int isbn) {
//        for(Book book : books){
//            if(book.getIsbn() == isbn){
//                books.remove(book);
//                break;
//            }
//        }

//        books.stream()
//                .filter(book -> book.getIsbn() == isbn)
//                .findFirst()
//                .ifPresent(book ->{
//                    books.remove(book);
//                });

        books.removeIf(b -> b.getIsbn() == isbn);

    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;

//        books.stream()
//                .filter(book -> book.getTitle().equals(title))
//                .findFirst()
//                .orElse(null);

//        return books.stream()
//                .filter(book -> book.getTitle().equals(title))
//                .findFirst();

    }

    public void getBookQuantity(int isbn) {
        books.forEach(book -> {
            if (book.getIsbn() == isbn) {
                book.getQuantity();
            }
        });
    }
    public void displayMenu(){
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
                "Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book. ");
        System.out.println("Press 8 to Check In Book");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }



}
