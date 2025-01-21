package _900_990;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class _970_TemporalAdjusters {

    public static void main(String[] args) {

        // LocalDate.with() (is recommended)
        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));  // e.g. 2022-04-19

        // TemporalAdjusters.next()
        System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now()));  // e.g. 2022-04-19
    }
}
