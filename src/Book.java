import java.util.Objects;

public class Book {
    private final String title;
    private  int publicationYear;
    private final Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    public String getTitle() {

        return title;
    }
    public int getPublicationYear() {

        return publicationYear;
    }
    public Author getAuthor() {

        return author;
    }
    public void setPublicationYear(int publicationYear) {

        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: "  + title + "  Год издания: " + publicationYear + "  Автор: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return  Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

