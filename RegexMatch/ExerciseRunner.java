import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExerciseRunner {

    public static void main(String[] args) throws IOException {
        System.out.println(RegexMatch.containsOnlyAlpha("azejkdfhjsdf")); // true
        System.out.println(RegexMatch.containsOnlyAlpha("azejkd fhjsdf")); // false
        System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6f5")); // true
        System.out.println(RegexMatch.startWithLetterAndEndWithNumber("asjd jd34jds jkfd6.")); // false
        System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAAAAsdjksj")); // true
        System.out.println(RegexMatch.containsAtLeast3SuccessiveA("sdjkAAsdaaasdjksj")); // false
    }
}






