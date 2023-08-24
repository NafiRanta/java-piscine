import java.io.IOException;
import java.util.stream.Stream;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(StreamMap.sumOfStringLength(Stream.of("Bonjour", "le", "monde !"))); // 16
        System.out.println(StreamMap.upperCaseAllString(Stream.of("IL", "Fait", "beaU !!"))); // [IL, FAIT, BEAU !!]
        System.out.println(StreamMap.uniqIntValuesGreaterThan42(Stream.of(23.439, 42.34, 39194.4))); // [42, 39194]
    }
}