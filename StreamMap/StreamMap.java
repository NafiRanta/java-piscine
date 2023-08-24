import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Set;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        // your code here
        IntStream totalStream = s.mapToInt(str -> str.length());
        return totalStream.sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        // Step 1: Use the map operation to convert each string to upper case
        Stream<String> upperCaseStream = s.map(str -> str.toUpperCase());

        // Step 2: Collect the stream of upper case strings into a List
        List<String> upperCaseList = upperCaseStream.collect(Collectors.toList());

        return upperCaseList;
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        // your code here
        // create mthd ref to  intValue mthd of Double
        Set<Integer> integerSet = s.filter(num -> num > 42).map(Double::intValue).collect(Collectors.toSet());

        return integerSet;
    }


}