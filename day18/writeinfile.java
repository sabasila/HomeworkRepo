package day18;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class writeinfile {
    public static void main(String[] args) {
        String fileName = "day18/saba.txt";
        File file = new File(fileName);

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,");
            writer.println("კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;");
            writer.println("კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,");
            writer.println("ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი.");
            System.out.println("ფაილი წარმატებით შეიქმნა!");
        } catch (IOException e) {
            System.out.println("ფაილში ჩაწერის შეცდომა: " + e.getMessage());
        }
    }
}
