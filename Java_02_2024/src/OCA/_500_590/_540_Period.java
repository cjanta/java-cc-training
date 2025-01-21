package _500_590;

import java.time.LocalDate;
import java.time.Period;

public class _540_Period {

    // Period
    // Periode, Zeitspanne

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2021, 3, 19);
        LocalDate ende = LocalDate.of(2023, 7, 3);

        // between()
        Period period = Period.between(start, ende);
        System.out.println(period);  // P2Y3M14D

        // getYears()
        System.out.println(period.getYears());   // 2
        System.out.println(period.getMonths());  // 3
        System.out.println(period.getDays());    // 14

        // isNegative()
        System.out.println(period.isNegative());  // false

        // plusDays(), ...
        period = period.plusDays(10000);
        System.out.println(period);  // P2Y3M10014D (Nicht zu gebrauchen)

        // of()
        Period period2 = Period.of(0, 1, 1);
        System.out.println(period2);  // P1M1D

        // ofDays(), ofMonths()
        Period period3 = Period.ofDays(7);
        System.out.println(period3);  // P7D
        Period period4 = Period.ofMonths(4);
        System.out.println(period4);  // P4M
        // Not chainable, because they are static:
        Period period5 = Period.ofMonths(4).ofDays(23);  // Läuft durch, aber macht keinen Sinn
        System.out.println(period5);  // P23D


    }
}
