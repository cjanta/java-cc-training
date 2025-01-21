package _300_390;

import java.util.ArrayList;

class MehrPolymorphie {
    public static void main(String[] args) {

        // Erstellen von Objekten für jede Klasse
        Person person = new Person("Peter");
        Schueler schueler = new Schueler("Harald");
        Studentin studentin = new Studentin("Klara");
        Angestellte angestellte = new Angestellte("Maike");

        // es geht auch so:
        Person studentin1 = new Studentin("Sabine");

        // aber so geht es nicht
        // Studentin studentin1 = new Person("Sabine"); // FEHLER!

        ArrayList<Person> personen = new ArrayList<>();
        personen.add(person);
        personen.add(schueler);
        personen.add(studentin);
        personen.add(angestellte);
        personen.add(studentin1);

        for (int i = 0; i < personen.size(); i++) {
            personen.get(i).info();
        }

        // Casting
        System.out.println("Typ von schueler: " + schueler.getClass());
        System.out.println("Typ von studentin: " + studentin.getClass());

        Person gecastetePerson = (Person) schueler;
        Schueler gecasteterSchueler = (Schueler) studentin;
        //Angestellte gecasteterSchueler= (Angestellte) Person; // downcasting funktioniert nicht!

        System.out.println("Typ von schueler nach dem casting: " + schueler.getClass());
        System.out.println("Typ von schueler nach dem casting: " + studentin.getClass());

    }
}

class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    void info() {
        System.out.println("ich bin eine person");
    }
}

class Schueler extends Person {
    Schueler(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("ich bin Schüler");
    }
}

class Studentin extends Schueler {
    Studentin(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("ich bin eine Studentin");
    }
}

class Angestellte extends Person {
    Angestellte(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("ich bin ein Angestellter");
    }
}
