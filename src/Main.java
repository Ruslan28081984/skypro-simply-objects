public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", 1984, levTolstoi);
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", 2005, pushkin);
        System.out.println("onegin.getPublicationYear() = " + onegin.getPublicationYear());
        onegin.setPublicationYear(2006);
        System.out.println("onegin.getPublicationYear() = " + onegin.getPublicationYear());
    }
}