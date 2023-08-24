import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Month;
import java.util.Locale;
import java.time.format.TextStyle;
import java.util.Map;
import java.util.HashMap;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        // extract from dateTime: year, month, day, 13hr, 25 mins, 46 sec
        if (dateTime == null){
            return null;
        }

        int year = dateTime.getYear();
        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        int hours = dateTime.getHour();
        int minutes = dateTime.getMinute();
        int seconds = dateTime.getSecond();

        Map<Integer, String> monthAbbreviations = createMonthAbbreviationsMap();
        String formattedMonth = monthAbbreviations.get(month.getValue());
        String formattedHoursMinutes = String.format("%02dh%02dm", hours, minutes);
        String formattedSeconds = String.format("%ds", seconds);

        String dateText = "Le " + day + " " + formattedMonth + " de l'an " + year + " à " + formattedHoursMinutes + " et " + formattedSeconds;

        return dateText;

    }

    public static String formatSimple(LocalDate date) {
        if (date == null){
            return null;
        }

        int day = date.getDayOfMonth();
        Month month = date.getMonth();
        int year = date.getYear();


        String formattedMonth = month.getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        String formattedDay = String.format("%02d", day);
        String formattedYear = String.valueOf(year % 100);


        String dateText = formattedMonth + " " + formattedDay + " " + formattedYear;

        return dateText;

    }

    public static Map<Integer, String> createMonthAbbreviationsMap() {
        Map<Integer, String> monthAbbreviations = new HashMap<>();
        monthAbbreviations.put(1, "jan.");
        monthAbbreviations.put(2, "fév.");
        monthAbbreviations.put(3, "mars");
        monthAbbreviations.put(4, "avr.");
        monthAbbreviations.put(5, "mai");
        monthAbbreviations.put(6, "juin");
        monthAbbreviations.put(7, "juil.");
        monthAbbreviations.put(8, "août");
        monthAbbreviations.put(9, "sept.");
        monthAbbreviations.put(10, "oct.");
        monthAbbreviations.put(11, "nov.");
        monthAbbreviations.put(12, "déc.");
        return monthAbbreviations;
    }

    public static String formatIso(LocalTime time) {
        if (time == null){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }



}