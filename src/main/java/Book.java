
public class Book {
    private String title;  // название книги
    private String author; // автор
    private Integer year; // год издания
    private Boolean isAvailable; // доступна ли книга для выдачи, изначально true).

    // Конструктор, принимающий все поля
    public Book(String title, String author, Integer year, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    // Конструктор, который задает только название книги и автора, остальные поля заполняются значениями по умолчанию.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = null;
        this.isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean isAvailable() {
        return isAvailable;
    }

    // Устанавливает isAvailable в false, если книга доступна.
    public void borrowBook() {
        if(isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Книга " + title + " недоступна!");
        }
    }

    // Устанавливает isAvailable в true.
    public void returnBook() {
        if(!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("Книга уже была возвращена ранее " + title);
        }
    }

    // Выводит на экран информацию о книге
    public void displayInfo() {
        System.out.println("Книга: " +
                "Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Год=" + (year == null ? "Не указан" : year) +
                ", Статус=" + (isAvailable ? "Доступна" : "Не доступна") +
                '}');
    }
}
