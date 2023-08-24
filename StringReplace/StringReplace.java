public class StringReplace {
    public static String replace(String s, Object target, Object replacement) {
        String tar = target.toString();
        String repl = replacement.toString();
        return s.replace(tar, repl);
    }

    public static String replace(String s, String target, String replacement) {
        return s.replace(target, replacement);
    }
}