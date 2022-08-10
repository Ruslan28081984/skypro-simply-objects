public class Main {
    public static void main(String[] args) {
        Author lev = new Author("Лев", "Толстой");
        Book warAndWorld = new Book("Война и мир", 1984, lev);
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", 2005, pushkin);
        System.out.println("onegin.getPublicationYear() = " + onegin.getPublicationYear());
        onegin.setPublicationYear(2006);
        System.out.println("onegin.getPublicationYear() = " + onegin.getPublicationYear());
    }
}