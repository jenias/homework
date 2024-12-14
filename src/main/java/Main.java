import java.util.List;

public class Main {
    public static void main(String [] args) {
        Library library = new Library();

        // Добавляем книги в библиотеку
        library.addBook(new Book("Java: эффективное программирование", "Блох Джошуа", 2022, true));
        library.addBook(new Book("Грокаем алгоритмы. 2-е изд.", "Бхаргава Адитья"));

        // Выводим доступные книги
        System.out.println("Выводим доступные книги:");
        library.printAvailableBooks();

        // Меняем статус книги и добавляем книгу
        Book book = new Book("Грокаем алгоритмы. 1-е изд.", "Бхаргава Адитья");
        book.borrowBook();
        library.addBook(book);

        // Ищем книги по автору и выводим
        System.out.println("\nВыводим книги автора Бхаргава Адитья:");
        List<Book> booksByAuthor = library.findBooksByAuthor("Бхаргава Адитья");
        for (Book tempBook : booksByAuthor) tempBook.displayInfo();


    }
}
