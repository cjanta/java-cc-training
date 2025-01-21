package _300_390;

class Hamburger {
    boolean vegan;
    int anzahlPattys;

    Hamburger(boolean vegan, int anzahlPattys) {
        this.vegan = vegan;
        this.anzahlPattys = anzahlPattys;
    }

    @Override
    public String toString() {
        return "Ich bin ein Hamburger! \n" +
                "Ich bin " + (this.vegan ? "vegan" : "mit Fleisch") + "\n" +
                "und ich habe " + this.anzahlPattys + " Patty's";
    }
}


public class _400_ToString {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(true, 2);
        System.out.println(hamburger);
    }
}
