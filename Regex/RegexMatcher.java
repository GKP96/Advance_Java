package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
    public static void main(String[] args) {
        String regexPattern = "\\d+";
        Pattern pattern = Pattern.compile(regexPattern);

        String testString = "123";

        Matcher matcher = pattern.matcher(testString);
        if (matcher.find()) {
            System.out.println("String matches the regex pattern.");
        } else {
            System.out.println("String does not match the regex pattern.");
        }
    }
}
