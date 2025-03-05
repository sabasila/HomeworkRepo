import java.io.*;
import java.util.*;

class Contact implements Serializable {
    private String name, surname, phone, email;

    public Contact(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
    public String toString() { return name + " " + surname + " - " + phone + " - " + email; }
}

class FileManager {
    private static final String FILE = "contacts.ser";

    public static void save(List<Contact> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(list);
        } catch (IOException e) {
            System.out.println("შეცდომა შენახვისას");
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Contact> load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            return (List<Contact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}

public class PhoneBook {
    private static List<Contact> list = FileManager.load();
    private static final int MAX = 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. დამატება  2. ნახვა  3. რედაქტირება  4. წაშლა  5. გასვლა");
            int ch = sc.nextInt(); sc.nextLine();
            switch (ch) {
                case 1: add(sc); break;
                case 2: list.forEach(System.out::println); break;
                case 3: edit(sc); break;
                case 4: delete(sc); break;
                case 5: sc.close(); return;
                default: System.out.println("არასწორი არჩევანი."); break;
            }

        }
    }

    private static void add(Scanner sc) {
        if (list.size() >= MAX) { System.out.println("სია სავსეა!"); return; }
        System.out.print("სახელი: ");
        String name = sc.nextLine();
        System.out.print("გვარი: ");
        String surname = sc.nextLine();
        System.out.print("ნომერი: ");
        String phone = sc.nextLine();
        System.out.print("იმეილი: ");
        String email = sc.nextLine();
        list.add(new Contact(name, surname, phone, email));
        FileManager.save(list);
    }

    private static void edit(Scanner sc) {
        System.out.print("სახელი: ");
        String name = sc.nextLine();
        System.out.print("გვარი: ");
        String surname = sc.nextLine();
        for (Contact c : list) {
            if (c.getName().equalsIgnoreCase(name) && c.getSurname().equalsIgnoreCase(surname)) {
                System.out.print("ახალი ნომერი: "); c.setPhone(sc.nextLine());
                System.out.print("ახალი იმეილი: "); c.setEmail(sc.nextLine());
                FileManager.save(list);
                return;
            }
        }
        System.out.println("კონტაქტი ვერ მოიძებნა.");
    }

    private static void delete(Scanner sc) {
        System.out.print("სახელი: ");
        String name = sc.nextLine();
        System.out.print("გვარი: ");
        String surname = sc.nextLine();
        list.removeIf(c -> c.getName().equalsIgnoreCase(name) && c.getSurname().equalsIgnoreCase(surname));
        FileManager.save(list);
    }
}


