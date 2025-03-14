package Exam2;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Student1 implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private double grade;
    private List<String> subjects;

    public double getGrade() {
        return grade;
    }
    public Student1(int id, String firstName, String lastName, int year, double grade, List<String> subjects)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.grade = grade;
        this.subjects = subjects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, grade);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student1 student = (Student1) obj;
        return id == student.id && subjects.containsAll(student.subjects) && student.subjects.containsAll(subjects);
    }


    @Override
    public String toString() {
        return "Student: {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", avgScore=" + grade +
                ", subjects=" + subjects +
                '}';
    }
    }

