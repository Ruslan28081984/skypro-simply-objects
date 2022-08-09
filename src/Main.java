public class Main {


    public static void main(String[] args) {
        Person sarah = new Person("Sarah",30);
//        System.out.println("sarah.name = " + sarah.getName());
//        System.out.println("sarah.age = " + sarah.getAge());
//        Person join = new Person("Join",25);
//        join.setAge(15);
//        sarah.setAge(31);
//        System.out.println("sarah.getAge() = " + sarah.getAge());
//        System.out.println("джону теперь = " + join.getAge());
        Author lev = new Author("Лев", "Толстой");
        Book book = new Book("Война и мир", 1984, lev);
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", 2005, pushkin);
        System.out.println("onegin.getPublicationYear() = " + onegin.getPublicationYear());
        onegin.setPublicationYear(2006);
        System.out.println("onegin.getPublicationYear() = " + onegin.getPublicationYear());
//        System.out.println("lev.getName() = " + lev.getName());
//        System.out.println("book.getAuthor().getName() = " + book.getAuthor().getName());
    }
}