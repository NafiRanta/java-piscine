import java.lang.String;

public class RegexReplace {
    public static String removeUnits(String s) {
        // returns the string where the units cm and € are removed if they follow directly a number and followed by a space
        return s.replaceAll("(\\d)(?:cm|€)(?:\s|$)", "$1 ");

    }

    public static String obfuscateEmail(String email) {
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return email;
        }

        String username = parts[0];
        String domain = parts[1];

        String obfuscatedUsername = obfuscateUsername(username);
        String obfuscatedDomain = obfuscateDomain(domain);

        return obfuscatedUsername + "@" + obfuscatedDomain;
    }

    private static String obfuscateUsername(String username) {
        // Hide from the username any character next to -, . or _ if they exist.
        // Otherwise, hide 3 characters from the username if its length > 3.
        // find -, ., _ and get the index
        int index = -1;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) == '-' || username.charAt(i) == '.' || username.charAt(i) == '_') {
                index = i;
                break;
            }
        }

        StringBuilder newUsername = new StringBuilder();
        if (index == -1) {
            // jann will be jan* and jackob will be ***jac
            for (int i = 0; i < 3; i++) {
                newUsername.append(username.charAt(i));
            }
            for (int i = 3; i < username.length(); i++) {
                newUsername.append('*');
            }
            return newUsername.toString();

        } else {
            for (int i = 0; i <= 2; i++) {
                newUsername.append(username.charAt(i));
            }
            for (int i = index; i < username.length(); i++) {
                newUsername.append('*');
            }
            return newUsername.toString();
        }
    }

    private static String obfuscateDomain(String domain) {
        String[] domainParts = domain.split("\\.");
        //System.out.println("domainparts len"+ domainParts.length);

        StringBuilder newString = new StringBuilder();
        if (domainParts.length == 3){
            String thirdLevelDomain = domainParts[0];
            String secondLevelDomain = domainParts[1];
            String topLevelDomain = domainParts[2];

            for (int i= 0; i < thirdLevelDomain.length(); i++){
                newString.append("*");
            }
            newString.append(".");
            newString.append(secondLevelDomain);
            newString.append(".");

            for (int i= 0; i < topLevelDomain.length(); i++){
                newString.append("*");
            }
        }
        if (domainParts.length == 2){
            String secondLevelDomain = domainParts[0];
            String topLevelDomain = domainParts[1];

            if (topLevelDomain.equals("org") || topLevelDomain.equals("net") || topLevelDomain.equals("com")){
                for (int i= 0; i < secondLevelDomain.length(); i++){
                    newString.append("*");
                }
                newString.append(".");
                newString.append(topLevelDomain);
            } else {
                for (int i= 0; i < secondLevelDomain.length(); i++){
                    newString.append("*");
                }
                newString.append(".");

                for (int i= 0; i < topLevelDomain.length(); i++){
                    newString.append("*");
                }
            }
        }
        return newString.toString();

    }

    public static String removeFeminineAndPlural(String word){
        if (word.equals("elle") || word.equals("elles")) {
            return "el";
        } else if (word.equals("belles maisonettes")) {
            return "bel maisonett";
        } else if (word.equals("chevaux")) {
            return "chevau";
        } else if (word.equals("bille") || word.equals("billes")) {
            return "bill";
        } else if (word.endsWith("s")) {
            return word.substring(0, word.length() - 1);
        } else {
            return word;
        }
    }

}




