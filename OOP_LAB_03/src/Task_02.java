/*

TASK – 02:
Write a Java class Book with following features:
 Instance variables:
o title for the title of book of type String.
o author for the author’s name of type String.
o price for the book price of type double.
 Constructor:
o public Book (String title, Author name, double price): A constructor with
parameters, it creates the Author object by setting the the fields to the passed
values.
 Instance methods:
o public void setTitle(String title): Used to set the title of book.
o public void setAuthor(String author): Used to set the name of author of
book.
o public void setPrice(double price): Used to set the price of book.
o public String getTitle(): This method returns the title of book.
o public String getAuthor(): This method returns the author’s name of book.
o public String toString(): This method printed out book’s details to the screen

 */



public class Task_02 {
    public static void main(String[] args) {
        Book book1 = new Book("Great Expectation", "Charles Dickens", 79.75F);
        book1.Display();
        Book book2 = new Book("Data Structure 3rd Edition", "John Martin", 98.5F);
        book2.Display();
    }
}

class Book {
    protected String Title;
    protected String Name;
    protected double Price;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    Book(String Title, String Name, double Price) {
        this.Title = Title;
        this.Name = Name;
        this.Price = Price;
    }

    void Display() {
        System.out.println("Book: " + Title + " Author: " + Name +
                " Price: " + Price + "$");
    }
}
