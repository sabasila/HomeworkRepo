package Exam2;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Excs2
{
    public static void main(String[] args)
    {
        List<Student1> students = new ArrayList<>();
        String inputFileName = "students.txt";
        String outputFileName = "studentss.txt";
        try
        {
            BufferedReader bufred = new BufferedReader(new FileReader(inputFileName)) ;
            String xazi;

            while ((xazi = bufred.readLine()) != null)
            {
                String[] data = xazi.split(",");
                int id = Integer.parseInt(data[0].trim());
                String firstName = data[1].trim();
                String lastName = data[2].trim();
                int year = Integer.parseInt(data[3].trim());
                double grade = Double.parseDouble(data[4].trim());
                List<String> subjects = Arrays.stream(data, 5, data.length)
                        .map(String::trim)
                        .collect(Collectors.toList());
                students.add(new Student1(id, firstName, lastName, year, grade, subjects));
            }
            bufred.close();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFileName));
            oos.writeObject(students);
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFileName));
            List<Student1> deserializedStudents = (List<Student1>) ois.readObject();
            ois.close();
            deserializedStudents.sort(Comparator.comparingDouble(Student1::getGrade)) ;
            for (Student1 student : deserializedStudents) {
                System.out.println(student);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
