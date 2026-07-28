package encapsulation;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qtyStock;

    public Book(String name, Author author, double price, int qtyStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyStock = qtyStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyStock() {
        return qtyStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyStock(int qtyStock) {
        this.qtyStock = qtyStock;
    }
}