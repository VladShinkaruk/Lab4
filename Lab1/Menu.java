package Lab1;
import java.util.Scanner;

public class Menu {
    public static void showMenu(Scanner scanner, Library... libraries) {
        int choice;
        do {
            System.out.println("1. Добавить книгу");
            System.out.println("2. Вывести книги по автору");
            System.out.println("3. Вывести всю информацию по книгам");
            System.out.print(": ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    LibraryActions.addBook(scanner, libraries);
                    break;
                case 2:
                    LibraryActions.printBooksByAuthor(scanner, libraries);
                    break;
                case 3:
                    LibraryActions.printAllBooks(libraries);
                    break;            
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }   while (true);
    }
}