
public class css {
    public static void main(String[] args) {
        String input = "საბა  სილაგაძე კარგი ბიჭია";
        String[] words = input.split("\\s+");

        for (String word : words)
        {
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.print(reversedWord + " ");
        }
    }
}
