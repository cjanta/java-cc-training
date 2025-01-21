package _500_590;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _530_LocalDateTime {

    public static void main(String[] args) {

        // now()
        LocalDateTime lodati = LocalDateTime.now();
        System.out.println(lodati);  // 2022-03-17T11:14:04.335

        // Restliche Methoden wie bei LocalDate & LocalTime
        System.out.println(lodati.getHour());  // 11

        // atDate() - Zeit an einem Datum - time AT a date
        LocalDate loda = LocalDate.now();
        System.out.println(loda);                  // 2022-03-17
        LocalTime loti = LocalTime.now();
        System.out.println(loti);                  // 11:17:39.229
        LocalDateTime lodati2 = loti.atDate(loda);
        lodati2 = lodati2.plusHours(14);
        System.out.println(lodati2);               // 2022-03-18T01:19:03.039

        // of()
        LocalDateTime lodati3 = LocalDateTime.of(2001, 4, 17, 22, 44, 55);
        System.out.println(lodati3);  // 2001-04-17T22:44:55

        // parse()
        // Der String muss genau stimmen
        LocalDateTime lodati4 = LocalDateTime.parse("2001-04-17T22:44:55");
        System.out.println(lodati4);
        // LocalDateTime lodati44 = LocalDateTime.parse("2001-04-17");  // DateTimeParseException

        // isBefore(LocalDateTime other), isAfter(LocalDateTime other)
        LocalDateTime lodati5 = LocalDateTime.parse("2021-07-17T22:11:00");
        LocalDateTime lodati6 = LocalDateTime.parse("2021-07-17T22:00:11");
        System.out.println(lodati5.isBefore(lodati6));  // false
        System.out.println(lodati5.isAfter(lodati6));   // true
    }
}
