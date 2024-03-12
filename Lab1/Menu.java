package Lab1;
import java.util.Scanner;

public class Menu {
    public static void showMenu(Scanner scanner, LibraryRepository repository) {
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Вывести книги по автору");
            System.out.println("3. Вывести всю информацию по книгам");
            System.out.println("0. Выход");
            System.out.print(": ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер после чтения числа

            switch (choice) {
                case 1:
                    LibraryActions.addBook(scanner, repository);
                    break;
                case 2:
                    LibraryActions.printBooksByAuthor(scanner, repository);
                    break;
                case 3:
                    LibraryActions.printAllBooks(repository);
                    break;
                case 0:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
}