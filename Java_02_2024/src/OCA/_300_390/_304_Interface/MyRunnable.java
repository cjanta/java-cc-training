package _300_390._304_Interface;

// Das Interface Runnable steht default in Java zur Verfuegung
// und kann beliebig überschrieben werden

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread läuft.");
    }

    public static void main(String[] args) {
        MyRunnable meinRunnable = new MyRunnable();
        Thread thread = new Thread(meinRunnable);
        thread.start();
    }
}
