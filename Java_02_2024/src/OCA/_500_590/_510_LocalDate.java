package _500_590;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _510_LocalDate {

    public static void main(String[] args) {

        // LocalDat
        // ISO 8601
        // Immutable

        // MIN, MAX
        System.out.println(LocalDate.MIN);  // -999_999_999-01-01
        System.out.println(LocalDate.MAX);  // +999_999_999-12-31

        // now()
        LocalDate loda1 = LocalDate.now();
        // System.out.println(loda1.toString());
        System.out.println(loda1);  // 2022-03-16
        System.out.println(loda1.getClass()); // class java.time.LocalDate

        // of()
        LocalDate loda2 = LocalDate.of(2007, 12, 24);
        System.out.println(loda2);  // 2007-12-24

        // Es wird geprüft, ob es das Datum geben kann
        // LocalDate loda3 = LocalDate.of(2007, 2, 29);
        // DateTimeException: Invalid date 'February 29' as '2007' is not a leap year

        // LocalDate loda3 = LocalDate.of(2007, 3, 32);
        // DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32

        // ofEpochDay()
        LocalDate loda4 = LocalDate.ofEpochDay(10000);
        System.out.println(loda4);  // 1997-05-19

        // parse()
        String str = "2008-02-29";
        LocalDate loda5 = LocalDate.parse("2008-02-29");
        System.out.println(loda5);  // 2008-02-29
        // LocalDate loda6 = LocalDate.parse("2007-02-29");
        // DateTimeParseException: Text '2007-02-29' could not be parsed:
        // Invalid date 'February 29' as '2007' is not a leap year

        // getYear(), ...
        System.out.println(loda5.getYear());        // 2008
        System.out.println(loda5.getMonth());       // FEBRUARY
        System.out.println(loda5.getDayOfMonth());  // 29
        System.out.println(loda5.getMonthValue());  // 2
        System.out.println(loda5.getDayOfWeek());   // FRIDAY
        System.out.println(loda4.lengthOfMonth());  // 31

        // isLeapYear()
        System.out.println(loda5.isLeapYear());  // true
        System.out.println(loda4.isLeapYear());  // false

        // isAfter(LocalDate other), isBefore(LocalDate other)
        System.out.println(loda4.isBefore(loda5));  // true

        // DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(loda5.format(dtf));  // 29.02.2008
        System.out.println(loda5);  // 2008-02-29

        // plusWeeks()
        loda5 = loda5.plusWeeks(77);
        System.out.println(loda5);                // 2009-08-21
        System.out.println(loda5.plusWeeks(12));  // 2009-11-13
        // LocalDate ist immutable
        System.out.println(loda5);                // 2009-08-21

        // Chainable
        // Jede Methode gibt ein neues LocalDate-Objekt zurück
        LocalDate loda6 = LocalDate.parse("2008-02-29").minusMonths(7).minusDays(14).plusYears(11);
        System.out.println(loda6);  // 2018-07-15

    }
}
