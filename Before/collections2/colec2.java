package collections2;

import java.util.*;

public class colec2
{
    // 1.
    public static void wordCount()
    {
        String[] words = {"საბა", "გიო", "ლუკა", "საბა", "გიო", "საბა"};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words)
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : wordCount.keySet())
        {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }

    // 2.
    static class Student
    {
        String id;
        String firstName;
        String lastName;
        HashMap <String, ArrayList<Integer>> grades = new HashMap <>() ;

        public Student(String id, String firstName, String lastName)
        {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void addGrades(String subject, ArrayList<Integer> subjectGrades )
        {
            grades.put(subject, subjectGrades) ;
        }
        public double getAverage()
        {
            int totalGrades = 0;
            int numberOfGrades = 0 ;

            for (ArrayList<Integer> gradeList :grades.values())
            {
                for (int grade : gradeList)
                {
                    totalGrades += grade;
                    numberOfGrades++;
                }
            }

            if (numberOfGrades == 0) {
                return 0;
            } else {
                return (double) totalGrades/ numberOfGrades;
            }
        }
    }

    // 3.
    static class StudentComparable extends Student  implements Comparable<StudentComparable>
    {

        public StudentComparable(String id, String firstName , String lastName)
        {
            super(id,firstName, lastName);
        }
        @Override
        public int compareTo (StudentComparable other)
        {
            double avg1 = this.getAverage();
            double avg2 =other.getAverage();
            return Double.compare(avg1 , avg2 );
        }
    }
    // 4
    static class StudentLastNameComparator implements Comparator<Student>
    {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.lastName.compareTo(o2.lastName);
        }
    }
    public static void main(String[] args) {
        // 1. სიტყვების დათვლა
        System.out.println("1. სიტყვების რაოდენობა:");
        wordCount();

        // 2. სტუდენტების შექმნა და მათი საშუალო ქულების გამოთვლა
        Student student1 = new Student("1", "საბა", "ჯანჯღავა");
        student1.addGrades("ქართული", new ArrayList<>(List.of(1, 4, 7, 8, 9, 10, 10, 10, 2)));
        student1.addGrades("მათემატიკა", new ArrayList<>(List.of(9, 8, 9, 8, 7, 7, 8, 9, 8, 10)));

        Student student2 = new Student("2", "გიო", "მხსრაიძე");
        student2.addGrades("ქართული", new ArrayList<>(List.of(8, 7, 6, 5, 4)));
        student2.addGrades("მათემატიკა", new ArrayList<>(List.of(7, 8, 9, 8, 9)));

        System.out.println("\n2. სტუდენტების საშუალო ქულები:");
        System.out.println(student1.firstName + " " + student1.lastName + " - საშუალო ქულა: " + student1.getAverage());
        System.out.println(student2.firstName + " " + student2.lastName + " - საშუალო ქულა: " + student2.getAverage());

        // 3. შედარება საშუალო ქულით
        System.out.println("\n3. შედარება საშუალო ქულით:");
        List<StudentComparable> students = new ArrayList<>();
        students.add(new StudentComparable("1", "საბა", "ჯანჯღავა"));
        students.add(new StudentComparable("2", "გიო", "მხსრაიძე"));

        // სტუდენტების დას排序 (sort) მათი საშუალო ქულების მიხედვით
        Collections.sort(students);
        for (StudentComparable student : students) {
            System.out.println(student.firstName + " " + student.lastName + " - საშუალო ქულა: " + student.getAverage());
        }

        // 4. შედარება გვარით
        System.out.println("\n4. შედარება გვარით:");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        // სტუდენტების დას排序 (sort) გვარების მიხედვით
        studentList.sort(new StudentLastNameComparator());
        for (Student student : studentList) {
            System.out.println(student.firstName + " " + student.lastName);
        }
    }
}
