package BookManagementSystem;
import java.util.*;

class Book {

    private String ISBN;
    private String name;
    private String author;
    private int year;

    public Book(){}

    public Book(String ISBN,String name, String author, int year) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN() {
        return ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public String toString(){
        return ISBN + " " + name + " "+ author + " " + year;
    }

    public int hashCode(){
        return this.toString().hashCode();
    }

    public boolean equals(Object obj){
        boolean flag = false;
        if(obj instanceof Book){
            Book b = (Book)obj;
            if(this.ISBN.equals(b.ISBN) && this.name.equals(b.name) && this.author.equals(b.author) && this.year == b.year){
                flag = true;
            }
        }
        return flag;
    }

}

//Book DAO-Data access object

// boolean addBook(Book book);
// boolean updateBook(Book book);
// boolean deleteBook(String ISBN);
// Book findBookByISBN(String ISBN);
// Book findBookByName(String name);
// List<Book> findAllBooks();
// List<Book> findBooksByAuthor(String author);
// List<Book> findBooksByYear(int year);



class BookDAO{
    List<Book> bookList;

    public BookDAO(){
        bookList = new ArrayList<Book>();
    }

    public boolean addBook(Book book){
        boolean flag = false;
        
        if(bookList.add(book)){
            flag = true;

        }
        return flag;

    }
    public boolean updateBook(Book book){
        boolean flag = false;
        int i=0;
        for(Book b : bookList){
            if(b.getISBN().equals(book.getISBN())){
                bookList.set(i, book);
                flag =true;            
            }
            i++;
        }
        return flag;
    }

    public boolean deleteBook(String ISBN){
        boolean flag = false;
        int i=0;
        for(Book b : bookList){
            if(b.getISBN().equals(ISBN)){
                bookList.remove(i);
                flag = true;
            }
            i++;
        }
        return flag;
    }
    public Book findBookByISBN(String ISBN){
        Book book = null;
        for(Book b : bookList){
            if(b.getISBN().equals(ISBN)){
                book = b;
            }
        }
        return book;
    }
    public Book findBookByName(String name){
        Book book = null;
        for(Book b : bookList){
            if(b.getName().equals(name)){
                book = b;
            }
        }
        return book;
    }
    public List<Book> findAllBooks(){
        return bookList;
    }
    public List<Book> findBooksByAuthor(String author){
        List<Book> books = new ArrayList<Book>();
        for(Book b : bookList){
            if(b.getAuthor().equals(author)){
                books.add(b); // b is a shallow copy as we are not creating a new object of book
            }
        }
        return books;
    }   

    public List<Book> findBooksByYear(int year){
        List<Book> books = new ArrayList<>();
        for(Book b: bookList){
            if(b.getYear() == year){
                books.add(b);
            }
        }
        return books;
    }
}

// BookDAO class is used to perform CRUD operations on Book objects


//BookDAO client class

public class BookDAOClient{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();
        do{
        System.out.println("1. Add Book");
        System.out.println("2. Update Book");
        System.out.println("3. Delete Book");
        System.out.println("4. Find Book By ISBN");
        System.out.println("5. Find Book By Name");
        System.out.println("6. Find All Books");
        System.out.println("7. Find Books By Author");
        System.out.println("8. Find Books By Year");
        System.out.println("9. Exit");
        int option = sc.nextInt();

        if(option == 9){
            System.out.println("Exiting...");
            break;  
        }
        

        switch(option){
            case 1:
                System.out.println("Enter ISBN:");
                String ISBN = sc.next(); sc.nextLine();
                System.out.println("Enter Book Name:");
                String name = sc.nextLine();
                System.out.println("Enter Author Name:");
                String author = sc.nextLine();
                System.out.println("Enter Year of Publication:");
                int year = sc.nextInt();
                Book book = new Book(ISBN, name, author, year);
                if(bookDAO.addBook(book)){
                    System.out.println("Book added successfully");
                }else{
                    System.out.println("Book not added");
                }
                break;

            case 2:
                System.out.println("Enter ISBN of the book to update:");
                ISBN = sc.next();
                book = bookDAO.findBookByISBN(ISBN);
                if(book != null){
                    System.out.println("Enter new Book Name:");
                    name = sc.next();
                    System.out.println("Enter new Author Name:");
                    author = sc.next();
                    System.out.println("Enter new Year of Publication:");
                    year = sc.nextInt();
                    book.setName(name);
                    book.setAuthor(author);
                    book.setYear(year);
                    if(bookDAO.updateBook(book)){
                        System.out.println("Book updated successfully");
                    }else{
                        System.out.println("Book not updated");
                    }
                }else{
                    System.out.println("Book not found");
                }
                break;

            case 3:
                System.out.println("Enter ISBN of the book to delete:");
                ISBN = sc.next();
                if(bookDAO.deleteBook(ISBN)){
                    System.out.println("Book deleted successfully");
                }else{
                    System.out.println("Book not deleted");
                }
                break;

            case 4:
                System.out.println("Enter ISBN of the book to find:");
                ISBN = sc.next();
                book = bookDAO.findBookByISBN(ISBN);
                if(book != null){
                    System.out.println("Book found:");
                    System.out.println(book.toString());
                }else{
                    System.out.println("Book not found");
                }
                break;

            case 5:
                System.out.println("Enter name of the book to find:");
                name = sc.next();
                book = bookDAO.findBookByName(name);
                if(book != null){
                    System.out.println("Book found:");
                    System.out.println(book.toString());
                }else{
                    System.out.println("Book not found");
                }
                
                break;

            case 6:
                System.out.println("All Books:");
                System.out.println("ISBN -  Name -  Author -  Year");
                for(Book b : bookDAO.findAllBooks()){
                    System.out.println(b.toString());
                }
                break;

            case 7:
                System.out.println("Enter author name to find books:");
                author = sc.next();
                List<Book> books = bookDAO.findBooksByAuthor(author);
                if(books.size() > 0){
                    System.out.println("Books by "+author+":");
                    System.out.println("ISBN Name Author Year");
                    for(Book b : books){
                        System.out.println(b.toString());
                    }
                }else{
                    System.out.println("No books found by "+author);
                }
                break;

            case 8:
                System.out.println("Enter year to find books:");
                year = sc.nextInt();
                books = bookDAO.findBooksByYear(year);
                if(books.size() > 0){
                    System.out.println("Books published in "+year+":");
                    System.out.println("ISBN Name Author Year");
                    for(Book b : books){
                        System.out.println(b.toString());
                    }
                }else{
                    System.out.println("No books found published in "+year);
                }
                break;
            default:
                System.out.println("Exiting . . . ");
                System.exit(0);
                break;

        }
        }while(true);
        sc.close();
    }
}


