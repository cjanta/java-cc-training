package _500_590;

import java.time.Instant;

public class _500_Instant {

    public static void main(String[] args) {

        // Instant - Moment

        // EPOCH, MIN, MAX
        System.out.println(Instant.EPOCH);  // 1970-01-01T00:00:00Z
        System.out.println(Instant.MIN);    // -1_000_000_000-01-01T00:00:00Z
        System.out.println(Instant.MAX);    // +1_000_000_000-12-31T23:59:59.999999999Z

        Instant moment = Instant.now();
        System.out.println(moment);  // 2022-03-16T10:51:32.982Z
        System.out.println(moment.getClass());  // class java.time.Instant

        Instant moment2 = Instant.ofEpochSecond(29060000);
        System.out.println(moment2);  // 1970-12-03T08:13:20Z

        System.out.println(System.currentTimeMillis());  // 1_647_428_249_604

    }
}
