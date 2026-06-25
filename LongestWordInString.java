public class LongestWordInString {
    public static void main(String[] args) {

        String s = "I love Java and SpringBoot";
        String words[] = s.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest Word : " + longestWord);
    }

}
