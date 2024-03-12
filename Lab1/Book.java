package Lab1;

class Book {
    // Делаем поля final, так как они не должны изменяться после инициализации объекта
    private final String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // Переопределение метода toString для удобного представления
    @Override
    public String toString() {
        return String.format("Название: %s, Автор: %s, Год: %d", title, author, year);
    }
}