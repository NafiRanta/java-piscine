import java.io.IOException;
import java.util.stream.Stream;
public class StreamReduce {
    public static Integer sumAll(Stream<Integer> s) {
        // your code here
        if (s == null){
            return 0;
        }

        int sum = s.reduce(0, Integer::sum);  // reduce accumulate elements of a stream to a single value
        return sum;
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        // your code here
        if (s == null){
            return 0;
        }
        int result = s.reduce(0, (a, b) -> a + b / divider);
        return result;
    }
}