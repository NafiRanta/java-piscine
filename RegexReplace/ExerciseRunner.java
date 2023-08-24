import java.io.IOException;
import java.lang.String;


public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(RegexReplace.removeUnits("32cm et 50€")); // 32 et 50
        System.out.println(RegexReplace.removeUnits("32 cm et 50 €")); // 32 cm et 50 €
        System.out.println(RegexReplace.removeUnits("32cms et 50€!")); // 32cms et 50€!
        System.out.println(RegexReplace.removeFeminineAndPlural("l lapin jou à la bel ball avec d animau rigolo pour gagner l bill bleu"));
        System.out.println(RegexReplace.obfuscateEmail("john.doe@example.com")); // joh****@*******.com
        System.out.println(RegexReplace.obfuscateEmail("jann@example.co.org")); // jan*@*******.co.***
        System.out.println(RegexReplace.obfuscateEmail("jackob@example.fr")); // jac***@*******.**
    }
}


    //If the remaining part after @ is in the format
// @<third level domain>.<second level domain>.<top level domain>,
// then hide the third and top level domains,
//
// otherwise hide the second level domain and the top level domain if it is not included in .com, .org and .net.