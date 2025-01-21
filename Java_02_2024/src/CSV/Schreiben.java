package CSV;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Schreiben {
    public static void main(String[] args) {
        // Schritt 1: Den Pfad festlegen
        // im Path könnte z.B. stehen: "C:\Users\User1\Desktop\MeineDateiname.meineDateiendung"
        final String PATH = "persons.csv";

        System.out.println("## Programm gestartet ##");

        // Schritt 2: Irgendwo her aus deinem Programm kommen Objekte (auch Strings wären Objekte)
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Max", "Mustermann", 30));
        persons.add(new Person("Anna", "Schmidt", 25));

        System.out.println("Personen in der Liste: ");
        for (Person person : persons) {
            System.out.println(person);
        }


        // Schritt 3: Beim FileWriter kann immer etwas schiefgehen deswegen wird ein Try-Catch-Block gebraucht.
        try (FileWriter csvWriter = new FileWriter(PATH)) {

            // Schritt 4 (Optional): eine Kopfzeile in die csv schreiben
            csvWriter.append("Vorname,Nachname,Alter\n");

            // Schritt 5: Lass den FileWriter schreiben bzw. appenden
            // achte darauf das am Ende eines Eintrags ein "\n" ist
            for (Person person : persons) {
                csvWriter.append(person.getFirstName() + "," + person.getLastName() + "," + person.getAge() + "\n");
            }
            System.out.println("CSV-Datei erfolgreich geschrieben.");
        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben der CSV-Datei: " + e.getMessage());
        }
    }
}
