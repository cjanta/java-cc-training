package _500_590._570_Rekursion;

public class _020_Summe {

    static int summe(int n) {

        if (n <= 0) return 0; // Der Wert, der nichts ausmacht.
        return n + summe(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(summe(10));
    }
}
