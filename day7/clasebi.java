package day7;

class Book {
    private String title;
    private String author;
    private int pages;

     Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

 void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

class Rectangle {
     double length;
     double width;

     Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }

    public double diagonal() {
        return Math.sqrt(length * length + width * width);
    }

    public boolean isSquare() {
        return length == width;
    }
}

class Time
{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime()
    {
        System.out.printf("", hours, minutes, seconds);
    }
}

public class clasebi
{
    public static void main(String[] args)
    {
        Book book1 = new Book("emilis tavgadasavali", "mak tveni", 324);
        book1.displayBookInfo();

        Book book2 = new Book("lasha", "grisha");
        book2.displayBookInfo();

        Rectangle rect = new Rectangle(7, 8);
        System.out.println("per: " + rect.perimeter());
        System.out.println("fartobi: " + rect.area());
        System.out.println("diagonali: " + rect.diagonal());
        System.out.println("kvadratia:: " + rect.isSquare());

        Time time = new Time(14, 30, 45);
        time.displayTime();
    }
}
