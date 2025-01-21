package _800_890._870_MethodeNurInDerElternklasse._030_;

class Ship {
    public int height = 5;

    public int getHeight() {
        return height;
    }
}

class Rocket extends Ship {
    public int height = 4;

    @Override
    public int getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Rocket().height);       // 4
        System.out.println(new Rocket().getHeight());  // 4
    }
}
