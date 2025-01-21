package _400_490;

import java.text.NumberFormat;
import java.util.Locale;

public class _400_NumberFormat {

    public static void main(String[] args) {

        // NumberFormat

        // Localization - Locale
        Locale locale_us = new Locale("us", "US");  // de_DE, de_CH

        double d1 = 1_234_567.89;

        // NumberFormat.getNumberInstance()
        NumberFormat nf_de = NumberFormat.getNumberInstance();
        System.out.println(nf_de.format(d1));  // 1.234.567,89
        NumberFormat nf_us = NumberFormat.getNumberInstance(locale_us);
        System.out.println(nf_us.format(d1));  // 1,234,567.89

        // NumberFormat.getCurrencyInstance()
        NumberFormat nf_de_cur = NumberFormat.getCurrencyInstance();
        System.out.println(nf_de_cur.format(d1));  // 1.234.567,89 €
        NumberFormat nf_us_cur = NumberFormat.getCurrencyInstance(locale_us);
        System.out.println(nf_us_cur.format(d1));  // USD 1,234,567.89

        // Zur Sicherheit, wenn man nicht weiss, ob es später auf deutschen Systemen laufen wird
        Locale locale_de = new Locale("de", "DE");
        NumberFormat nf_de_cur_2 = NumberFormat.getCurrencyInstance(locale_de);
        System.out.println(nf_de_cur_2.format(d1));  // 1.234.567,89 €


    }
}
