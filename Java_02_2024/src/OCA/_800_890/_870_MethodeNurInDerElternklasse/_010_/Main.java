package _800_890._870_MethodeNurInDerElternklasse._010_;

class Ship {
    public int height = 5;
}

class Rocket extends Ship {
    public int height = 4;
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Rocket().height);  // 4
    }
}
