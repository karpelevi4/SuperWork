package task3.book;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("John Green", "Looking for Alaska", 600);
        System.out.println(b);
        b.markAsRead();
        System.out.println(b);
        Book c = new Book("Bible", 300);
        System.out.println(c);
        c.setPrice(250);
        System.out.println("Is's sale now. "
        + c.getName() + " costs " + c.getPrice() + "."
        );
    }
}
