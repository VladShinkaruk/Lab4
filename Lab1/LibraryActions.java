package Lab1;
import java.util.Scanner;

public class LibraryActions {

    public static void addBook(Scanner scanner, Library... libraries) {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.print("Введите год написания книги: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите название библиотеки: ");
        String libraryName = scanner.nextLine();

        for (Library library : libraries) {
            if (library.getName().equals(libraryName)) {
                library.addBook(new Book(title, author, year));
            }
        }
    }

    public static void printBooksByAuthor(Scanner scanner, Library... libraries) {
        System.out.print("Введите имя автора: ");
        String authorToSearch = scanner.nextLine();

        for (Library library : libraries) {
            System.out.println("Книги автора " + authorToSearch + " в " + library.getName() + ":");
            for (Book book : library.getBooksByAuthor(authorToSearch)) {
                System.out.println(book.getTitle() + " - " + book.getYear());
            }
        }
    }

    public static void printAllBooks(Library... libraries) {
        for (Library library : libraries) {
            System.out.println("Библиотека " + library.getName());
            for (Book book : library.getBooks()) {
                System.out.println("Название: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Год: " + book.getYear());
            }
            System.out.println();
        }
    }
}