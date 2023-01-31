package homeworks.homework12;

public class Book {
    /* Task 6:
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String title;
    String author;
    double price;


    Book (String bookTitle, String authorName, double bookPrice) {
        title=bookTitle;
        author=authorName;
        price=bookPrice;
    }

    Book (String bookTitle, String authorName) {
        title=bookTitle;
        author=authorName;
    }

    void printInfo () {
        if (price==0.0) {
            System.out.println("Book title is " + title + " and the author is " + author);
        } else {
        System.out.println("Book title is " + title + " and the author is " + author + " and the price is $" + price);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Limitless","Jim Kwik",14.99);
        book1.printInfo();

        Book book2 = new Book("Atomic Habits","James Clear");
        book2.printInfo();
    }

}
