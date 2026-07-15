package encapsulation;

public class BookDemo {

    public static void main(String[] args) {

        Author author = new Author(
                "Mukundha Priya",
                "mukundha@gmail.com",
                'F');

        Book book = new Book(
                "Java Programming",
                author,
                599.50,
                10);

        System.out.println("Book Name : " + book.getName());
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Email : " + book.getAuthor().getEmail());
        System.out.println("Gender : " + book.getAuthor().getGender());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity : " + book.getQtyStock());

    }
}