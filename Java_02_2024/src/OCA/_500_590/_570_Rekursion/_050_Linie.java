package _500_590._570_Rekursion;

public class _050_Linie {

    static String linie(int anzahl, char zeichen) {

        if (anzahl <= 0) return "";
        return zeichen + linie(anzahl - 1, zeichen);
    }

    public static void main(String[] args) {

        System.out.println(linie(10, '*'));  // **********
    }
}
