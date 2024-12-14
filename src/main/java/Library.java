import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> books;

    static {
        books = new ArrayList<>();
        books.add(new Book("Первая книга", "Первый автор", 2024, true));
        books.add(new Book("Вторая книга", "Второй автор", 2023, false));
    }
    public Library() {

    }

    // добавляет книгу в библиотеку.
    public void addBook(Book book) {
        books.add(book);
    }

    // выводит все доступные книги.
    public void printAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) book.displayInfo();
        }
    }

    // возвращает книги автора.
    public List<Book> findBooksByAuthor(String author) {
        List<Book> tempBooks = new ArrayList<>();
        for (Book book : books) {
            if(book.getAuthor().equals(author)) {
                tempBooks.add(book);
            }
        }
        return tempBooks;
    }
}
