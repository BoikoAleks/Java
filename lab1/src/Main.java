import java.lang.String;

public class Main {
    public static void main(String[] args) {
        HorrorBook Book = new HorrorBook();
        Book.setPages(128);
        Book.setTitle("title");

        book Book2 = new book();
        Book2.setGenre("folk");
        Book2.setPages(789);
        Book2.setTitle("enretil");

        book Book3 = new book();
        Book3.setGenre("folk");
        Book3.setPages(789);
        Book3.setTitle("enretil");
        System.out.println(Book2.equals(Book3));
        System.out.println(Book2.hashCode());
        System.out.println(Book.hashCode());
        System.out.println(Book3.hashCode());
    }
}