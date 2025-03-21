import java.util.*;
import java.util.stream.*;

class strem {
    public static void main(String[] args) {
        // 1
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 3, 8, 25);
        int sum = numbers.stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println( sum);
        // 2
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C++", "Julia", "Ruby");
        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println( filteredWords);

        // 3
        Set<String> sortedSet = words.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println( sortedSet);

        // 4
        class Human
        {
            String name;
            int age;
            Human(String name, int age)
            {
                this.name = name;
                this.age = age;
            }
        }

        List<Human> people = Arrays.asList
                (
                new Human("Giorgi", 20),
                new Human("Levani", 18),
                new Human("Nino", 14),
                new Human("Luka", 16)
        );

        boolean hasLevani = people.stream()
                .filter(h -> h.age >= 15)
                .anyMatch(h -> h.name.equals("Levani"));
        System.out.println("levani aris ?? " + hasLevani);

        // 5)
        List<Integer> nums = Arrays.asList(3, 7, 1, 9, 12, 5, 8);
        List<Integer> sortedNums = nums.stream().sorted().distinct().collect(Collectors.toList());
        int secondMin = sortedNums.size() > 1 ? sortedNums.get(1) : -1;
        int secondMax = sortedNums.size() > 1 ? sortedNums.get(sortedNums.size() - 2) : -1;

        System.out.println( secondMin);
        System.out.println( secondMax);
    }
}
