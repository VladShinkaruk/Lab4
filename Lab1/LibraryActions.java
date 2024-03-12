package Lab1;
import java.util.Optional;
import java.util.Scanner;

public class LibraryActions {

    // Добавляем метод для получения библиотеки по имени с использованием Optional
    private static Optional<Library> getLibraryByName(LibraryRepository repository, String name) {
        return Optional.ofNullable(repository.findLibraryByName(name));
    }

    public static void addBook(Scanner scanner, LibraryRepository repository) {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.print("Введите год написания книги: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Очищаем буфер
        System.out.print("Введите название библиотеки: ");
        String libraryName = scanner.nextLine();

        // Используем Optional для обработки отсутствующей библиотеки
        getLibraryByName(repository, libraryName).ifPresentOrElse(
            library -> library.addBook(new Book(title, author, year)),
            () -> System.out.println("Библиотека с названием \"" + libraryName + "\" не найдена.")
        );
    }

    public static void printBooksByAuthor(Scanner scanner, LibraryRepository repository) {
        System.out.print("Введите имя автора: ");
        String authorToSearch = scanner.nextLine();

        repository.getLibraries().forEach(library -> {
            System.out.println("Книги автора " + authorToSearch + " в библиотеке " + library.getName() + ":");
            library.getBooksByAuthor(authorToSearch).forEach(book -> 
                System.out.println(book.getTitle() + " - " + book.getYear()));
        });
    }

    public static void printAllBooks(LibraryRepository repository) {
        repository.getLibraries().forEach(library -> {
            System.out.println("Библиотека " + library.getName());
            library.getBooks().forEach(book -> 
                System.out.println(book.toString())); // Используем toString для вывода информации о книге
        });
    }
}