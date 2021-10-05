package task3.book;

public class Book {

    private String name;
    private int price;
    private String author;
    private boolean read;

    public Book(String author, String name, int price) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.read = false;
    }

    public Book(String name, int price) {
        this.author = "Unknown";
        this.name = name;
        this.price = price;
        this.read = false;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void markAsRead() {
        this.read = true;
    }

    public boolean isRead() {
        return read;
    }

    @Override
    public String toString() {
        return "Book is called " + name +
                ", it's price is " + price +
                ", it is written by " + author +
                ", you have" + (this.isRead()?" ":" not ") +
                "read it yet.";
    }
}
