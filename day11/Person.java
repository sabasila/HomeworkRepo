// Class Person
class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static class Manager extends Employee {
        private String mgrId;

        public Manager(String name, String surname, int age, String id, String mgrId) {
            super(name, surname, age, id);
            this.mgrId = mgrId;
        }

        public String getMgrId() {
            return mgrId;
        }

        public void setMgrId(String mgrId) {
            this.mgrId = mgrId;
        }
    }

    static class Employee extends Person {
        private String id;

        // Constructor
        public Employee(String name, String surname, int age, String id) {
            super(name, surname, age);
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}

