import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        // your code here
        if (map1 == null && map2 == null){
            return true;
        }

        if (map1.equals(map2)){
            return true;
        }
        return false;
    }
}