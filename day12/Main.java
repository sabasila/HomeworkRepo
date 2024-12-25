package day12;

public class Main {
    public static void main(String[] args) {

        Bk bk1 = new AdvBk("კაცი რომელსაც შუ უყვარდა", 300, "ნიკა კვარაცხელია", true);
        Bk bk2 = new SciBk("ქართული ენა და სიყვარულის", 250, "ნანა მელიქიძე", false, "ფიზიკა");
        Bk bk3 = new FanBk("საფრთხე სიძულვილისა", 400, "მარიამ ალანია", true, "საქართველო");

        Bk[] bks = {bk1, bk2, bk3};



        Emp cleaner = new Cleaner("ალექსანდრე", "ჩხეტია", 1);
        Emp lender = new Lender("თეონა", "ქობალია", 2, "09:00", "17:00");
        Emp ctrl = new SilenceCtrl("გიორგი", "ხუციშვილი", 3, 8.5);
        Advisor advisor = new Advisor("მარიამი", "ჭანტურია", 4, 9.7, "ქალაქის ბიბლიოთეკა");

        Emp[] emps = {cleaner, lender, ctrl, advisor};

        Lib lib = new Lib("ქალაქის ბიბლიოთეკა", emps, bks);

        Bk recBk = advisor.recommend(bks);
        System.out.println("მირჩეული წიგნი: " + recBk);

        // ბიბლიოთეკის დეტალების დაბეჭდვა
        System.out.println(lib);
        for (Emp emp : emps) {
            System.out.println(emp);
        }
        for (Bk bk : bks) {
            System.out.println(bk);
        }
    }
}
