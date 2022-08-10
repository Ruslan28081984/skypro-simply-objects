public class Book {
    private final String name;
    private  int publicationYear;
    private final Author author;

    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    public String getName() {
        return name;
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
}

