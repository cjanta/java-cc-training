package _301_LF12aV2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Erstelle die Methoden der ServerQueue,
 * beachte, dass bereits ein Queue als Attribut vorgegeben ist.
 */
public class Server {

    public static void main(String[] args) {
        Server serverQueue = new Server();
        serverQueue.userHatWasGeclicked("GET");
        serverQueue.userHatWasGeclicked("POST");
        serverQueue.userHatWasGeclicked("DELETE");
        serverQueue.showQueue();
        System.out.println("erledigt: " + serverQueue.aufgabeErledigt());
        serverQueue.showQueue();
        System.out.println("Queue size: " + serverQueue.size());
    }

    private Queue<String> data = new LinkedList<>();

    public void userHatWasGeclicked(String requestType) {
        //Todo
    }

    public String aufgabeErledigt() {
        //Todo
        return "noch nicht implementiert";
    }

    public void showQueue() {
        //Todo
    }

    public int size() {
        //Todo
        return 0;
    }
}
