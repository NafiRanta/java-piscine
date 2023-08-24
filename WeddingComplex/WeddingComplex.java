import java.util.List;
import java.util.Map;
import java.util.*;

//Gale-Shapley algorithm
public class WeddingComplex {
    // Returns a map of name from the second map associated with a name from the first list. determine the best couple possible.
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        // Make a map to store the married couples
        Map<String, String> married = new HashMap<>();
        // Create a set list of all single members, initially add everyone into this list
        Set<String> singles = new HashSet<>(first.keySet());
        System.out.println("singles: " + singles);

        while (!singles.isEmpty()) {
            String member = singles.iterator().next(); // find a single member and then retrieve their list of preferences.
            System.out.println("member: " + member);
            List<String> preferences = first.get(member);
            System.out.println("preferences: " + preferences);

            for (String preferredPartner : preferences) {
                if (married.containsKey(preferredPartner)) {
                    String currentPartner = married.get(preferredPartner);
                    List<String> partnerPreferences = second.get(preferredPartner);
                    System.out.println("partnerPreferences: " + partnerPreferences);

                    // Compare the preferences of the current partner and the proposing member
                    if (partnerPreferences.indexOf(member) < partnerPreferences.indexOf(currentPartner)) {
                        // The proposing member is more preferred
                        singles.add(currentPartner); // Make the current partner free
                        married.put(preferredPartner, member); // Update the partnership
                        singles.remove(member); // Remove the proposing member from the list of free members
                        break;
                    }
                } else {
                    // The preferred partner is not married, so they get engaged
                    married.put(preferredPartner, member);
                    singles.remove(member);
                    break;
                }
            }
        }

        // Reverse the key-value pairs in the married map
        Map<String, String> reversedMarried = new HashMap<>();
        for (Map.Entry<String, String> entry : married.entrySet()) {
            reversedMarried.put(entry.getValue(), entry.getKey());
        }

        return reversedMarried;
    }
}