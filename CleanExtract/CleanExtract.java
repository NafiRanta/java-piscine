public class CleanExtract {
    public static String extract(String s) {
        String[] substrings = s.split("\\|");
        StringBuilder result = new StringBuilder();

        for (String sub : substrings) {
            String extracted = extractSubstring(sub);
            if (!extracted.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(extracted);
            }
        }

        return result.toString().trim();
    }

    private static String extractSubstring(String sub) {
        int firstDot = sub.indexOf('.');
        int lastDot = sub.lastIndexOf('.');

        if (firstDot == lastDot && firstDot >= 0 && lastDot >= 0) {
            return sub.substring(firstDot + 1).trim();
        }

        if (firstDot >= 0 && lastDot >= 0 && firstDot != lastDot) {
            return sub.substring(firstDot + 1, lastDot).trim();
        }

        return sub.trim();
    }
}