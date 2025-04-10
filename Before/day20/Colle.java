package day20;

import java.io.*;
import java.util.*;

public class Colle {
    public static void main(String[] args) {
        // 1.
        ArrayList<Integer> numbers = new ArrayList<>() ;
        Random random = new Random();
        while (!numbers.contains(40 ))
        {
            numbers.add(random.nextInt(51)) ;
        }
        System.out.println(numbers.size()) ;
        printList (numbers);
        numbers.removeIf(n -> n % 2 == 0);
        printList(numbers);
        // 3.
        int[] array = new int [5];
        for (int i= 0;i < array.length; i++) {
            array[i] = random.nextInt(51);
        }

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int num : array) {
            numberList.add(num);
        }

        int maxIndex = 0;
        for (int i =1; i< numberList.size(); i ++ )
        {
            if (numberList.get(i)> numberList.get (maxIndex))
            {
                maxIndex= i;
            }
        }
        System.out.println( maxIndex);

        // 4
        Library library = new Library();
        library.populateList("books.txt");
        library.printBooks ();
    }

    // 2.
    public static void printList(List<Integer> list)
    {
        System.out.print("List of { ");
        for (int i = 0; i < list.size();i++)
        {
            System.out.print(list.get(i)) ;
            if (i < list.size() - 1) System.out.print(", ") ;
        }
        System.out.println(" }");
    }
}

// 4.wignis
class Book1 {
    private String name;
    private int numberOfPages;

    public Book1(String name, int  numberOfPages)
    {
        this.name = name ;
        this.numberOfPages = numberOfPages;
    }

    public String getName()
    {
        return name ;
    }

    public void setName(String name)
    {
        this.name= name ;
    }

    public int getNumberOfPages()
    {
        return numberOfPages ;
    }

    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages =numberOfPages;
    }

    @Override
    public String toString() {
        return "წიგნი{სახელი='" + name + "', გვერდების რაოდენობა=" + numberOfPages + "}" ;
    }
}

// 4. biblioteka
class Library
{
    private ArrayList<Book1> books = new ArrayList<>() ;

    public ArrayList<Book1> getBooks()
    {
        return books ;
    }

    public void setBooks(ArrayList<Book1> books)
    {
        this.books = books;
    }

    public void populateList(String filename)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while ((line = br.readLine())!= null )
            {
                String[] parts = line.split(" ");
                if (parts.length == 2)
                {
                    String name = parts[0] ;
                    int pages = Integer.parseInt(parts[1]) ;
                    books.add(new Book1(name, pages));
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void printBooks() {
        for (Book1 book1 : books) {
            System.out.println(book1);
        }
    }
}
