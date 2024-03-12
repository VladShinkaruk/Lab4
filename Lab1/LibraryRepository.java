package Lab1;
import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
    private List<Library> libraries = new ArrayList<>();

    // Добавить библиотеку
    public void addLibrary(Library library) {
        libraries.add(library);
    }

    // Удалить библиотеку
    public void removeLibrary(String libraryName) {
        libraries.removeIf(library -> library.getName().equals(libraryName));
    }

    // Изменить библиотеку
    public void updateLibrary(String oldName, Library newLibrary) {
        for (int i = 0; i < libraries.size(); i++) {
            if (libraries.get(i).getName().equals(oldName)) {
                libraries.set(i, newLibrary);
                break;
            }
        }
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    // Найти по имени
    public Library findLibraryByName(String name) {
        for (Library library : libraries) {
            if (library.getName().equals(name)) {
                return library;
            }
        }
        return null;
    }
}
