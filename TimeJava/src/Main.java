import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        // Date
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
        // Time
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
        // Date&Time
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
        // UTC
//        Instant instant = Instant.now();
//        System.out.println(instant);

        // Custom Format
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String newDateTime = dateTime.format(formatter);
//        System.out.println(newDateTime);

        LocalDate date = LocalDate.of(2024,12,25);
        System.out.println(date);
    }
}