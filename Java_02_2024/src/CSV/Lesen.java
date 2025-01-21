package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lesen {
    public static void main(String[] args) {

        // Schritt 1: Den Pfad festlegen
        // im Path könnte z.B. stehen: "C:\Users\User1\Desktop\MeineDateiname.meineDateiendung"
        final String PATH = "persons.csv";

        System.out.println("## Programm gestartet ##");

        // Schritt 2: Beim BufferedReader kann immer etwas schiefgehen deswegen wird ein Try-Catch-Block gebraucht.
        try (BufferedReader csvReader = new BufferedReader(new FileReader(PATH))) {

            // Schritt 3 (Optional): mit ".readline()" lesen wir die erste Zeile, damit überspringen wir die Kopfzeile
            csvReader.readLine(); // Überspringt die Kopfzeile


            // Schritt 4: individuelle Vorbereitungen zum Lesen der Daten treffen
            String row; // hier werden wir die gelesene Zeile empfangen
            String[] data; // hier werden wird die gelesene Zeile in die richtigen Datentypen casten
            ArrayList<Person> personen = new ArrayList<>(); // hierin speichern wir das was wir gelesen haben

            System.out.println("\n## Datei wird gelesen: ##");
            // Schritt 5: mit ".readline()" wird eine Zeile (die nächste Zeile) der Datei gelesen
            // diesen schritt wiederholen wir bis alle Zeilen gelesen wurden
            while ((row = csvReader.readLine()) != null) {
                data = row.split(",");
                personen.add(new Person(data[0], data[1], Integer.parseInt(data[2])));
            }

            // Schritt 6: Individuelle weiterverarbeitung der Daten
            System.out.println("## folgende Daten wurden gelesen ##");
            for (Person person : personen)
                System.out.println(person);

        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der CSV-Datei: " + e.getMessage());
        }

        System.out.println("\n## Programm beendet ##");
    }
}
