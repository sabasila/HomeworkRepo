// 1. b. შეამოწმოს ორი ობიექტი ლოგიკურად ტოლია თუ არა
// 2. a. თუ ორი ობიექტი ტოლია equals() მეთოდით, მაშინ hashCode() მეთოდმა ორივე ობიექტის შემთხვევაში იგივე უნდა დააბრუნოს
// 3. a. რათა შევქმნათ მნიშვნელობის მქონდე და ადამიანისთვის მარტივად წაკითხვადი ობიექტის ტექსტური მნიშვნელობა
//    b. რათა შევცვალოთ როგორ დაიბეჭდება ჩვვენი ობიექტი System.out.println() -ის დროს
//    d. რათა უფრო მარტივად შევძლოთ დანახვა და პრობლემების გამოსწორება, რომლებიც შეიძლება ობიექტს ჰქონდეს
//4.  c.
//    true
//    true
//    Person: Alice, age: 30
//5.  a. equals() მეთოდი სწორადაა შედგენილი ორი ობიექტის შესადარებლად
//    c. იმისათვის რომ equals() და hashCode() მეთოდებს შორის შედგეს უკეთესი კავშირი კარგი იქნებოდა თუ hashCode() მეთოდს დავწერდით
//6.  b. მისი მნიშვნელობის შეცვლა შეუძლებელია შექმნის შემდგომ
//7   c. equals()
//8.  b. true , false
//9   b. IndexOutOfBoundsException
//10  c. Caught ArrayIndexOutOfBoundsException Finally block executed
//11  c. 3
//12  b. List -ში რიგითობა შენარჩუნებულია და ელემენტების გამეორებაშეიძლება, Set -ში რიგითობა არაა შენარჩუნებული და არც ელემენტების გამეორება შეიძლება
//13  a. Map -ს არ შეიძლება ჰქონდეს ორი ერთნაირი key
//    b. Map -ს შეუძლია ჰქონდეს ორი ერთნაირი value
//    c. Map ინტერფეისი არ აექსთენდებს Collection ინტერფეისს
//14  b. ნაკლები ადგილი თითო ელემენტისთვის მეხსიერებაში
//    d. უფრო ჩქარი ელემენტების წაკითხვა ინდექსების გამოყენებით
//15  b. მაპში იქნება 3 Entry
//    c. როდესაც უკვე არსებული გასაღები ხელახლა შევა მაპში ახალი მნიშვნელობა ძველს ჩაანაცვლებს
