import java.util.Map;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;
public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        // your code here
        Map<Character, List<String>> mapByFirstLetter = new HashMap<>();
        s.forEach(word -> {
            char uppercaseFirstLetter = Character.toUpperCase(word.charAt(0));

            if (mapByFirstLetter.containsKey(uppercaseFirstLetter)) {
                mapByFirstLetter.get(uppercaseFirstLetter).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                mapByFirstLetter.put(uppercaseFirstLetter, list);
            }
        });
        return mapByFirstLetter;
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        // your code here
        Map<Integer, Optional<Integer>> maxByModulo4 = new HashMap<>();
        s.forEach(i -> {
            if (maxByModulo4.containsKey(i % 4)) {
                Optional<Integer> max = maxByModulo4.get(i % 4);
                if (i > max.get()) {
                    maxByModulo4.put(i % 4, Optional.of(i)); // Optional.of create an instance
                }
            } else {
                maxByModulo4.put(i % 4, Optional.of(i));
            }
        });
        return maxByModulo4;
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        // your code here
        return "{" + s.sorted().collect(Collectors.joining(" # ")) + "}";

    }


}