import java.util.ArrayList;
import java.util.List;

public class WhiteboardingSteven {
    public static void main(String[] args) {
        // Gordon Ramsay shouts. He shouts and swears. There may be something wrong with him.
        // Anyway, you will be given a string of four letter words. Your job is to turn them in to Gordon language.
        // Rules:
        // Obviously the words should be Caps, Every word should end with '!!!!', Any letter 'a' or 'A' should
        // become '@', Any other vowel should become '*'.
        // Print results to the console
        // Example Bird should print B*RD!!!!
        String [] ramsey = new String [] {
                "Bird", "Cats", "Abba", "BRRR", "eiou"};
        // Your code goes here
        List<String> newWords = new ArrayList<>();
        for (String word : ramsey) {
            String gordonWord = "";
            for (int i = 0; i < word.length(); i++) {
                word = word.toUpperCase();
                if(word.charAt(i) == 'A') {
                    gordonWord += "@";
                } else if ( word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O'
                        || word.charAt(i) == 'U' ) {
                    gordonWord += "*";
                } else {
                    gordonWord += word.charAt(i);
                }
            }
            newWords.add(gordonWord + "!!!!");
            //newWords.add(word + "!!!!");
        }
        System.out.println(newWords);
    }
}
