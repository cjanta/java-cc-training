package _500_590;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class _520_LocalTime {

    public static void main(String[] args) {

        // now()
        LocalTime loti1 = LocalTime.now();
        System.out.println(loti1);  // 15:04:19.581
        System.out.println(loti1.getClass());  // class java.time.LocalTime

        // Statische Konstanten
        System.out.println(LocalTime.MIN);       // 00:00
        System.out.println(LocalTime.MAX);       // 23:59:59.999999999
        System.out.println(LocalTime.NOON);      // 12:00
        System.out.println(LocalTime.MIDNIGHT);  // 00:00

        // of()
        LocalTime loti2 = LocalTime.of(16, 30);
        System.out.println(loti2);  // 16:30
        LocalTime loti3 = LocalTime.of(20, 0, 1);
        System.out.println(loti3);  // 20:00:01
        LocalTime loti4 = LocalTime.of(20, 0, 1, 12345678);
        System.out.println(loti4);  // 20:00:01.012345678
        // LocalTime loti5 = LocalTime.of(16, 70);
        // DateTimeException: Invalid value for MinuteOfHour (valid values 0 - 59): 70

        // parse()
        LocalTime loti6 = LocalTime.parse("16:30");
        System.out.println(loti6);  // 16:30
        // LocalTime loti7 = LocalTime.parse("6:3");
        // DateTimeParseException: Text '6:3' could not be parsed at index 0

        // getHour()
        System.out.println(loti6.getHour());  // 16

        // format(DateTimeFormatter)
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH-mm-ss");
        System.out.println(loti1.format(dtf1));  // 15-39-06

        // isBefore(LocalTime other), isAfter(LocalTime other)
        System.out.println(loti1.isBefore(loti2));  // true
        LocalDate loda1 = LocalDate.now();
        // System.out.println(loti1.isBefore(loda1));
        // java: incompatible types: java.time.LocalDate cannot be converted to java.time.LocalTime

        // plus(), minus()
        LocalTime loti8 = loti1.plus(10, ChronoUnit.MINUTES);
        System.out.println(loti8);  // 15:57:43.906

    }
}
