package day18;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class uppercase {
    public static void main(String[] args)
    {
        String fileName = "day18/output.txt";
        File file = new File(fileName);
        String text = """
                Assure polite his real and other figures though. Day age advantages
                and sufficient eating expression traveling. Of on am father by agreed
                supply rather either. Own handsome delicate property mistresses her
                end appetite. Mean are sons too sold nor said. Son share three men
                power by you. Now merits wonder effect garret own.
                """;

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println(text.toUpperCase());
            System.out.println("ფაილი წარმატებით შეიქმნა.");
        } catch (IOException e) {
            System.out.println("ფაილში ჩაწერის შეცდომა: " + e.getMessage());
        }
    }
}
