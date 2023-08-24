import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null || value == null) {
            return null;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }

        return null;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        // your code here
        if (list == null || value == null){
            return null;
        }

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(value)){
                return i;
            }
        }
        return null;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        // your code here
        if (list == null || value == null){
            return new ArrayList<>();
        }

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(value)){
                indices.add(i);
            }
        }
        return indices;
    }
}