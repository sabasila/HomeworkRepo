import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class excss {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "გიორგი", "ბერა"));
        students.add(new Student(2, "ანა", "გველესიანი"));
        students.add(new Student(3, "გიორგი", "მელი"));
        students.add(new Student(4, "ანა", "ზოიძე"));
        students.add(new Student(5, "გოჩა", "გაგნიძე"));

        Collections.sort (students, new Comparator<Student>()
        {
            @Override
            public int compare(Student s1, Student s2)
            {
                int nameCompare = s1.getFirstName().compareTo(s2.getFirstName());

                if (nameCompare != 0) {
                    return nameCompare;
                }
                int lastNameCompare = s1.getLastName().compareTo(s2.getLastName());
                if (lastNameCompare != 0) {
                    return lastNameCompare;
                }
                return Integer.compare(s2.getId(), s1.getId());
            }

        });
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}
class Student
{
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}
