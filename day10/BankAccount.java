package day10;

public class BankAccount {
    private String holder;
    private double balance;
    private String[] history;
    private boolean locked;

    // Constructor
    public BankAccount(String holder, double initialBalance) {
        this.holder = holder;
        this.balance = initialBalance;
        this.history = new String[100];
        this.locked = true;
    }

    public void printHistory() {
        if (!locked) {
            System.out.println("დაბლოკილია");
            return;
        }

        System.out.println("ისტორია:");
        for (String trans : history) {
            if (trans != null) {
                System.out.println(trans);
            }
        }
    }

    public boolean transfer(BankAccount recipient, double amount) {
        if (!locked) {
            System.out.println("დაბლოკილია");
            return false;
        }

        if (amount > 1000) {
            System.out.println("1000ზე მეტს ვერ გადავიტანთ.");
            return false;
        }

        if (balance < amount) {
            System.out.println("არასაკმარისი თანხა.");
            return false;
        }

        this.balance -= amount;
        recipient.receive(amount);
        String trans = "თანხა" + amount + " ამასთან " + recipient.getHolder();
        for (int i = 0; i < history.length; i++) {
            if (history[i] == null) {
                history[i] = trans;
                break;
            }
        }        System.out.println(trans);
        return true;
    }

    private void receive(double amount)
    {
        this.balance += amount;
        String trans = "მიიღე " + amount;
        for (int i = 0; i < history.length; i++) {
            if (history[i] == null) {
                history[i] = trans;
                break;
            }
        }
    }

    public String getHolder() {
        return holder;
    }


    public void lock() {
        this.locked = false;
        System.out.println("დაიბლოკა.");
    }

    public void unlock() {
        this.locked = true;
        System.out.println("გაინბლოკა");
    }


    public double calcDeposit(double amount, int months) {
        if (!locked) {
            System.out.println("დაბლოკილია ვერ შეძლებ ვერაფერ" +
                    "ს");
            return 0;
        }

        double total = amount;
        for (int i = 0; i < months; i++)
        {
            total += total * 0.01;
        }
        return total;
    }
    public double getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return locked;
    }
}
