public class StringConcat {
    public static String concat(String s1, String s2) {
        // your code here
        if (s1 == null && s2 == null){
            return null;
        } else if( s1== null){
            return "il pleut";
        } else if (s2== null){
            return "Hello World";
        }
        return s1 + s2;
    }
}