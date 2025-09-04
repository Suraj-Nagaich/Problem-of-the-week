import java.util.*;
public class ReverseWordsWithDelimiters {
    public static String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            words.add(word.toString());
        }
        Collections.reverse(words);
        StringBuilder result = new StringBuilder();
        int w = 0;
        for (int i = 0; i < s.length(); ) {
            if (Character.isLetter(s.charAt(i))) {
                result.append(words.get(w++));                            // take next reversed word
                while (i < s.length() && Character.isLetter(s.charAt(i))) {
                    i++;
                }
            } else {
                result.append(s.charAt(i));                             // copy delimiter
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords(s));   
    }
}

         
