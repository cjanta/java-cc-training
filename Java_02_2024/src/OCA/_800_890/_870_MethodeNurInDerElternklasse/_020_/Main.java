package _800_890._870_MethodeNurInDerElternklasse._020_;

// Der Compiler sucht getHeight() in Rocket vergeblich.
// Dann sucht er in der Elternklasse weiter und nimmt die Methode dort.
// Dadurch wird auch die Variable aus der Elternklasse genommen.

class Ship {
    public int height = 5;

    public int getHeight() {
        return height;
    }
}

class Rocket extends Ship {

    public int height = 4;
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Rocket().height);       // 4
        System.out.println(new Rocket().getHeight());  // 5
    }
}
