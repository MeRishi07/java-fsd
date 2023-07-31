package Assisted_Practice_Projects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice_Project10 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";

        // Regular expression pattern to match "quick"
        String patternString1 = "quick";
        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(text);
        boolean matches1 = matcher1.find();
        System.out.println("Pattern \"" + patternString1 + "\" matches: " + matches1);

        // Regular expression pattern to match words starting with "b"
        String patternString2 = "\\b[bB]\\w+";
        Pattern pattern2 = Pattern.compile(patternString2);
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            System.out.println("Matched word: " + matcher2.group());
        }

        // Regular expression pattern to match all lowercase letters
        String patternString3 = "[a-z]";
        Pattern pattern3 = Pattern.compile(patternString3);
        Matcher matcher3 = pattern3.matcher(text);
        StringBuilder lowercaseLetters = new StringBuilder();
        while (matcher3.find()) {
            lowercaseLetters.append(matcher3.group());
        }
        System.out.println("Lowercase letters: " + lowercaseLetters);
    }
}
