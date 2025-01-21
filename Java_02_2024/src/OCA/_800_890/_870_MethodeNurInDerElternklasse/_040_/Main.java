package _800_890._870_MethodeNurInDerElternklasse._040_;

class Ship {
    public int height = 5;

    public int getHeight() {
        return height;
    }
}

class Rocket extends Ship {

    Rocket() {
        height = 4; // Hier wird dem Compiler bewusst gemacht, dass Rocket height hat.
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Rocket().height);       // 4
        System.out.println(new Rocket().getHeight());  // 4
    }
}
