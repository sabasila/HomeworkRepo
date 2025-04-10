package Collections3;

import java.util.*;

class Player {
    String name, surname;
    int points, rebounds, blocks, assists, turnovers;

    public Player(String name, String surname, int points, int rebounds, int blocks, int assists, int turnovers) {
        this.name = name;
        this.surname = surname;
        this.points = points;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.turnovers = turnovers;
    }

    public double getRating() {
        return points + rebounds + blocks * 2 + assists * 1.5 - turnovers * 2;
    }

    @Override
    public String toString() {
        return name + " " + surname + " - რეიტინგი: " + getRating();
    }
}

// სტუდენტის კლასი
class Student
{
    String name, surname;
    Date birthDate;
    ArrayList<Integer> grades;

    public Student(String name, String surname, Date birthDate, ArrayList<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.grades = grades;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return name + " " + surname + " - საშუალო ქულა: " + getAverageGrade();
    }
}

// ძრავის კლასი
class Engine {
    String fuel;
    int cylinders;
    double capacity;

    public Engine(String fuel, int cylinders, double capacity) {
        this.fuel = fuel;
        this.cylinders = cylinders;
        this.capacity = capacity;
    }
}

// მანქანის კლასი
class Car {
    String brand, model;
    int year, mileage;
    Engine engine;

    public Car(String brand, String model, int year, int mileage, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return brand + " " + model + " - წელი: " + year + " - გარბენი: " + mileage + " - ძრავი: " + engine.capacity + "L";
    }
}

public class collections3 {
    public static void main(String[] args)
    {
       // დავაგენერირებინოთ სტუდენტები, მანქანები
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("ლებრონ", "ჯეიმსი", 30, 10, 2, 8, 3));
        players.add(new Player("სტეფენ", "კარი", 28, 5, 1, 10, 2));
        players.add(new Player("კევინ", "დურანტი", 32, 7, 3, 6, 4));

        players.sort(Comparator.comparingDouble(Player::getRating).reversed());
        System.out.println("\nკალათბურთელები რეიტინგის კლებადობით:");
        players.forEach(System.out::println);

        players.sort(Comparator.comparingDouble(Player::getRating));
        System.out.println("\nკალათბურთელები რეიტინგის ზრდის მიხედვით:");
        players.forEach(System.out::println);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("გიორგი", "მარგველაშვილი", new GregorianCalendar(2002, Calendar.MARCH, 15).getTime(), new ArrayList<>(Arrays.asList(90, 85, 88))));
        students.add(new Student("ანა", "ბერიძე", new GregorianCalendar(2001, Calendar.JULY, 20).getTime(), new ArrayList<>(Arrays.asList(95, 92, 89))));
        students.add(new Student("ნიკა", "ქავთარაძე", new GregorianCalendar(2003, Calendar.JANUARY, 10).getTime(), new ArrayList<>(Arrays.asList(80, 75, 78))));

        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("\nსტუდენტები ლექსიკოგრაფიულად დალაგებული:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
        System.out.println("\nსტუდენტები საშუალო ქულით დალაგებული:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparing(s -> s.birthDate));
        System.out.println("\nსტუდენტები დაბადების თარიღის მიხედვით დალაგებული:");
        students.forEach(System.out::println);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("ტოიოტა", "კოროლა", 2015, 120000, new Engine("ბენზინი", 4, 1.8)));
        cars.add(new Car("ბმვ", "X5", 2018, 80000, new Engine("დიზელი", 6, 3.0)));
        cars.add(new Car("ფორდი", "ფოკუსი", 2012, 150000, new Engine("ბენზინი", 4, 2.0)));

        cars.sort(Comparator.comparingInt(c -> c.year));
        System.out.println("\nმანქანები გამოშვების წელის მიხედვით:");
        cars.forEach(System.out::println);

        cars.sort(Comparator.comparingInt(c -> c.mileage));
        System.out.println("\nმანქანები გარბენის მიხედვით:");
        cars.forEach(System.out::println);

        cars.sort(Comparator.comparingDouble(c -> c.engine.capacity));
        System.out.println("\nმანქანები ძრავის მოცულობის მიხედვით:");
        cars.forEach(System.out::println);
    }
}