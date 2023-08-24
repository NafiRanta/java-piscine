import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        // your code here
        Set<Integer> mergedSet = new HashSet<>(set1);
        mergedSet.addAll(set2);
        return mergedSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        // your code here
        Set<Integer> mergedSet = new HashSet<>(set1);
        mergedSet.retainAll(set2);
        return mergedSet;

    }
}