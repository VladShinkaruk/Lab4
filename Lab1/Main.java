package Lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Создание репозитория библиотек
        LibraryRepository repository = new LibraryRepository();

        Library library1 = new Library("Novoya");
        Library library2 = new Library("Veselaya");
        Library library3 = new Library("Pervaya");

        library1.addBook(new Book("Salah", "Bababui", 2018));
        library1.addBook(new Book("Liverpool", "Klopp", 2015));
        library2.addBook(new Book("Messi", "Barcelona", 2008));
        library2.addBook(new Book("Ronaldo", "Real Madrid", 2007));
        library3.addBook(new Book("Victory", "Klopp", 2023));

        // Добавляем библиотеки в репозиторий
        repository.addLibrary(library1);
        repository.addLibrary(library2);
        repository.addLibrary(library3);

        // Передаем репозиторий в Menu
        Menu.showMenu(scanner, repository);
    }
}