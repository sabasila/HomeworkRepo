package day14;

class Library
{
    private int id;
    private String name;

    public Library(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void printInfo()
    {
        System.out.println("ბიბლიოთეკის ID: " +id) ;
        System.out.println("ბიბლიოთეკის დასახელება: " + name) ;

        class Book
        {
            private int bookId;
            private String bookName;

            public Book(int bookId, String bookName)
            {
                this.bookId = bookId;
                this.bookName = bookName;
            }

            public void printInfo()
            {

                System.out.println("წიგნის იდ: " + bookId);

                System.out.println("წიგნის დასახელება: " + bookName);
            }
        }

        Book book = new Book(101, "Java Programming");
        book.printInfo();
    }
}

public class lib {
    public static void main(String[] args) {
        Library lib = new Library(1, "ცაას ბიბლიოთეკა");
        lib.printInfo();
    }
}
