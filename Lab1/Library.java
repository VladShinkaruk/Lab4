package Lab1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Library {
    private String libraryName;
    // Используем ArrayList для инициализации, но возвращаем тип List для большей гибкости
    private List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return libraryName;
    }

    // Возвращаем тип List вместо конкретной реализации
    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    // Используем Stream для фильтрации книг по автору
    public List<Book> getBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
}