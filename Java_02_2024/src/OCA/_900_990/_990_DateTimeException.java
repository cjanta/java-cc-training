package _900_990;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;

public class _990_DateTimeException {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        // System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ldt));  // UnsupportedTemporalTypeException
        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(ldt));  // 2022-04-14T14:43:28.186

        UnsupportedTemporalTypeException utte = new UnsupportedTemporalTypeException("Hello");
        System.out.println(utte instanceof DateTimeException);  // true
        System.out.println(utte instanceof RuntimeException);   // true

    }
}
