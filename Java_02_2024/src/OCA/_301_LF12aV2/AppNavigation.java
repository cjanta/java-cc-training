package _301_LF12aV2;

import java.util.Stack;

/**
 * Erstelle die Methoden der App. Beachte das bereits ein Stack als Attribut vorgegeben ist
 */
public class AppNavigation {
    public static void main(String[] args) {
        AppNavigation app = new AppNavigation();
        app.seiteOeffnen(new Seite("Startseite", "Willkommen in unserer App!"));
        app.seiteOeffnen(new Seite("Menü", "1. Option A\n2. Option B\n3. Option C"));
        app.seiteOeffnen(new Seite("Detailseite", "Details zu Option B"));

        app.aktuelleSeiteAnzeigen();
        app.zurueckGehen();
        app.aktuelleSeiteAnzeigen();
        app.zurueckGehen();
        app.aktuelleSeiteAnzeigen();
    }

    private Stack<Seite> seitenHistorie = new Stack<>();


    public void seiteOeffnen(Seite aktuelleSeite) {
        // TODO
    }

    public void zurueckGehen() {
        // TODO
    }

    public void aktuelleSeiteAnzeigen() {
        // TODO
    }

    private static class Seite {
        private String seitenName;
        private String inhalt;

        public Seite(String seitenName, String inhalt) {
            this.seitenName = seitenName;
            this.inhalt = inhalt;
        }

        @Override
        public String toString() {
            return "\"" + seitenName + "\" - " + inhalt;
        }
    }
}
