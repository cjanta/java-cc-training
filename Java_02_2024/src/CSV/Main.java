package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ##################################### eine csv schreiben ####################################
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
        // #################################### Done ###################################

        //
        // Hier wird die CSV-Datei gelesen und Personen werden ausgegeben
        try (BufferedReader csvReader = new BufferedReader(new FileReader(PATH))) {
            csvReader.readLine(); // Überspringt die Kopfzeile

            System.out.println("\n## Personen aus der CSV-Datei: ##");
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                Person person = new Person(data[0], data[1], Integer.parseInt(data[2]));
                System.out.println(person);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der CSV-Datei: " + e.getMessage());
        }

        System.out.println("\n## Programm beendet ##");
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{firstName: " + firstName + " lastName: " + lastName + " age: " + age + "}";
    }
}
