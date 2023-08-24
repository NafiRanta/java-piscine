
public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        // returns true if the string as parameter contains only alpha characters
        return s.matches("[a-zA-Z]+");
    }

    public static boolean startWithLetterAndEndWithNumber(String s) {
        // returns true if the string as parameter starts with one letter and ends with one number.
        return s.matches("^[A-Za-z].*[0-9]$");
    }

    public static boolean containsAtLeast3SuccessiveA(String s) {
        // returns true if the string as parameter contains at least 3 successive A.
        return s.matches(".*AAA.*");
    }
}