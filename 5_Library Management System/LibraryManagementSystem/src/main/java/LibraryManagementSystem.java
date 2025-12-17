import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public void viewBook(){
//        for(int i = 0; i< books.size(); i++){
//            System.out.println(books.get(i));
//        }
        books.forEach(System.out::println);
    }
    public void updateBook(String author, String title, int isbn){
        for(Book book : books){
            if(book.getIsbn() == isbn){
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
    public void deleteBook(int isbn){
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
    public Book getBookByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
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





}
