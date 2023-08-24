import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        return LocalDateTime.parse(stringDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", new Locale("fr"));
        LocalDate date = LocalDate.parse(stringDate, inputFormatter);
        return date;
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        Pattern pattern = Pattern.compile("(\\d{2}) heures du soir, (\\d{2}) minutes et (\\d{2}) secondes");
        Matcher matcher = pattern.matcher(stringDate);

        if (matcher.find()) {
            int hours = Integer.parseInt(matcher.group(1));
            // convert hours to 24hr
            hours += 12;
            int minutes = Integer.parseInt(matcher.group(2));
            int seconds = Integer.parseInt(matcher.group(3));

            return LocalTime.of(hours, minutes, seconds);
        } else {
            throw new IllegalArgumentException("Invalid input format");
        }
    }
}
