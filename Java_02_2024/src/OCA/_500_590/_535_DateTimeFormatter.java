package _500_590;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class _535_DateTimeFormatter {

    public static void main(String[] args) {

        // LocalTime.format(DateTimeFormatter)
        LocalTime loti1 = LocalTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH-mm-ss");
        System.out.println(loti1.format(dtf1));  // e.g. 15-39-06

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime lt1 = LocalTime.parse("11:11:11", dtf2);
        System.out.println(lt1);  // 11:11:11


        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime ldt1 = LocalDateTime.parse("2022-02-22T22:22:22", dtf3);
        System.out.println(ldt1);  // 2022-02-22T22:22:22

        // DateTimeParseException
        // Falsche ISO-Format (ISO_LOCAL_DATE_TIME statt ISO_LOCAL_TIME)
        // LocalTime lt2 = LocalTime.parse("11:11:11", dtf3);

        // UnsupportedTemporalTypeException
        // Falsche ISO-Format (ISO_DATE_TIME statt ISO_DATE)
        // System.out.println(LocalDate.of(2019, Month.APRIL, 3).format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(LocalDate.of(2019, Month.APRIL, 3).format(DateTimeFormatter.ISO_DATE));


    }
}
