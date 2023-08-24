import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        // create a map to return
        Map<String, String> coupleMap = new HashMap<>();

        // find the max size of the map, which will be the smallest size of the 2 sets
        int maxSize = Math.min(first.size(), second.size());

        // convert the sets to arrays
        String[] firstArray = first.toArray(new String[0]);
        String[] secondArray = second.toArray(new String[0]);

        // fill the map
        for (int i = 0; i < maxSize; i++) {
            coupleMap.put(firstArray[i], secondArray[i]);
        }

        return coupleMap;
    }
}