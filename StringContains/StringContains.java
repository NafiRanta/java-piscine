public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        // your code here
        if (subString == null && s == null){
            return false;
        }else if (subString == null ){
            return false;
        } else if (s == null){
            return false;
        }
        return s.contains(subString);
    }
}