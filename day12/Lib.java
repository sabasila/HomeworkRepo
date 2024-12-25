// General Library Class
class Lib {
    private String name;
    private Emp[] emps;
    private Bk[] bks;
    public Lib(String name, Emp[] emps, Bk[] bks)
    {
        this.name = name;
        this.emps = emps;
        this.bks = bks;
    }

    public String getName() {
        return name;
    }

    public Emp[] getEmps() {
        return emps;
    }

    public Bk[] getBks() {
        return bks;
    }

    @Override
    public String toString() {
        return "ბიბლიოთეკა " + name;
    }
}

// General Employee Class
class Emp {
    private String fName;
    private String lName;
    private int id;

    public Emp(String fName, String lName, int id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }

    @Override
    public String toString() {
        return  fName + " " + lName + " (ID: " + id + ")";
    }
}

// Subclasses of Emp
class Cleaner extends Emp {
    public Cleaner(String fName, String lName, int id) {
        super(fName, lName, id);
    }
}

class Lender extends Emp {
    private String start;
    private String end;

    public Lender(String fName, String lName, int id, String start, String end) {
        super(fName, lName, id);
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return super.toString() + ", საათი: " + start + "-" + end;
    }
}

class SilenceCtrl extends Emp {
    private double strict;

    public SilenceCtrl(String fName, String lName, int id, double strict) {
        super(fName, lName, id);
        this.strict = strict;
    }

    @Override
    public String toString() {
        return super.toString()  + strict;
    }
}

class Advisor extends Emp {
    private double rating;
    private String libType;

    public Advisor(String fName, String lName, int id, double rating, String libType) {
        super(fName, lName, id);
        this.rating = rating;
        this.libType = libType;
    }

    public Bk recommend(Bk[] bks) {
        int randIdx = (int) (Math.random() * bks.length);
        return bks[randIdx];
    }

    @Override
    public String toString()
    {
        return super.toString() + ", შეფასება: " + rating + ", ტიპი: " + libType;
    }
}

class Bk {
    private String title;
    private int pages;
    private String author;
    private boolean isHardcover;

    public Bk(String title, int pages, String author, boolean isHardcover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public void read() {
        System.out.println("კითხულობ " + title);
    }

    @Override
    public String toString()
    {
        return "წიგნი: " + title + ", გვერდები: " + pages + ", ავტორი: " + author + ", ს: " + isHardcover;
    }
}


class AdvBk extends Bk
{
    public AdvBk(String title, int pages, String author, boolean isHardcover) {
        super(title, pages, author, isHardcover);
    }
}

class SciBk extends Bk
{
    private String field;

    public SciBk(String title, int pages, String author, boolean isHardcover, String field) {
        super(title, pages, author, isHardcover);
        this.field = field;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + field;
    }
}


class FanBk extends Bk
{
    private String country;

    public FanBk(String title, int pages, String author, boolean isHardcover, String country)
    {
        super(title, pages, author, isHardcover);
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + ", ქვეყანა " + country;
    }
}