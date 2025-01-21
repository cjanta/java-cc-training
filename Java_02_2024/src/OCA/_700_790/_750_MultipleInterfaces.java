package _700_790;

// Multiple Vererbung durch Interfaces per kommaseparierter Liste

// Zwei implementierte Interfaces haben die gleichnamige default Methode
// Dann müssen die implementierenden Klassen diese Methode implementieren.

interface Face1 {
    default void machWas() {
        System.out.println("Ich bin Face1!");
    }
}

interface Face2 {
    default void machWas() {
        System.out.println("Ich bin Face2!");
    }
}

// class Macher implements Face1, Face2 {
class Macher implements Face2, Face1 {  // Reihenfolge ist unerheblich
    @Override
    public void machWas() {
        System.out.println("Ich bin der Macher!");
    }
}

public class _750_MultipleInterfaces {

    public static void main(String[] args) {
        new Macher().machWas();  // Ich bin der Macher!
    }
}


// Multiple Inheritance of type
// Wird in Java gewährleistet durch die Möglicjkeit mehrere Interfaces zu implementieren.

// Multiple Inheritance of state
// Wird von Java nicht unterstützt.
// Ein Interface vererbt die Attribute nicht, da alle Attribute automatisch statisch sind.
// Es kann nur von einer Klasse geerbt werden.