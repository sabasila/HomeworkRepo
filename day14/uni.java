package day14;

class Uni {
    private String name;
    private boolean state;
    private int facs;

    public Uni(String name, boolean state, int facs) {
        this.name = name;
        this.state = state;
        this.facs = facs;
    }

    public void printInfo() {
        System.out.println("უნივერსიტეტის დასახელება: " + name);
        if (state) {
            System.out.println("სახელმწიფო უნივერსიტეტი: დიახ");
        } else {
            System.out.println("სახელმწიფო უნივერსიტეტი: არა");
        }
        System.out.println("ფაკულტეტების რაოდენობა: " + facs);
    }

    class Stud {
        private String fname;
        private String lname;
        private int age;
        private String pid;
        private double avg;
        private int course;

        public Stud(String fname, String lname, int age, String pid, double avg, int course)
        {
            this.fname =  fname;
            this.lname= lname;
            this.age = age;
            this.pid = pid;
            this.avg = avg;
            this.course = course;
        }

        public void printInfo() {
            System.out.println("სტუდენტის სახელი: " + fname + " " + lname);
            System.out.println("ასაკი: " + age);
            System.out.println("პირადი ნომერი: " + pid);
            System.out.println("საშუალო ქულა: " + avg);
            System.out.println("კურსი: " + course);
        }
    }
}

public class uni {
    public static void main(String[] args) {
        Uni uni = new Uni("თავისუფალი", true, 10);
        uni.printInfo();

        Uni.Stud stud = uni.new Stud("იკა", "კილასონია", 230, "2222244443", 32, 23);
        stud.printInfo();
    }
}
