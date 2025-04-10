package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainHum
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print(" სახელი ") ;
            String name= reader.readLine();
            System.out.print(" გვარი ");
            String surname =reader.readLine();
            System.out.print(" ასაკი ") ;
            int age = Integer.parseInt(reader.readLine()) ;
            Human person1 = new Human(name , surname , age);
            Human person2 = new Human("საბა", "სილაგაძე" , 12) ;
            person1.walk() ;
            person1.hangOut(person2);
        }
        catch (IOException e)
        {
            System.out.println("შეცდომა " + e.getMessage());
        }
    }
}
