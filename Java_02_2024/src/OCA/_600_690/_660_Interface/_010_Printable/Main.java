package _600_690._660_Interface._010_Printable;

// Interface
// implements
// Contract of behavior - Handlungsvorschrift
// Etwas muss eine bestimmte Fähigkeit haben: z.B. druckbar - printable
// Egal zu welcher Klasse es gehört.

// Methoden in Interfaces können nur public sein
// und das Keyword public wird vom Java-Compiler automatisch eingefügt.
// abstract ist standard.

interface Printable {
    // public abstract void print();
    void print();
}

class Person implements Printable {

    public void print() {
        System.out.println("Ich bin eine Person!");
    }
}

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.print();  // Ich bin eine Person!

        // Polymorphismus
        // Ein Interface kann Referenz-Typ sein
        Printable person2 = new Person();
        person2.print();  // Ich bin eine Person!

    }
}
