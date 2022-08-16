public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", 1984, levTolstoi);
        Book warAndPeaceSecond = new Book("Война и мир", 1984, levTolstoi);
        warAndPeace.setPublicationYear(2002);
        System.out.println(warAndPeace);
        System.out.println(warAndPeace.equals(warAndPeaceSecond));

    }
}