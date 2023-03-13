package hocthu2;

interface StringToIntFunction {
    int apply(String s);
}

public class Main {
    public static void main(String[] args) {
        StringToIntFunction countChars = s -> s.length();

        StringToIntFunction countWords = s -> {
            String[] words = s.split("\\s+");
            return words.length;
        };

        StringToIntFunction countA = s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }
            return count;
        };

        StringToIntFunction countUniqueChars = s -> {
            String uniqueChars = s.chars()
                    .distinct()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            return uniqueChars.length();
        };

        String str = "Luu Thanh Hieu.";

        System.out.println("Number of characters: " + countChars.apply(str));
        System.out.println("Number of words: " + countWords.apply(str));
        System.out.println("Number of 'a' or 'A' characters: " + countA.apply(str));
        System.out.println("Number of unique characters: " + countUniqueChars.apply(str));
    }
}
