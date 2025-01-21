package _210_260;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _020_LottoZiehung {
    public static void main(String[] args) {
    // Lottoziehung
    //
    // Schreibe ein Programm,
    // das sechs verschiedene Lottozahlen (6 aus 49) zieht
    // und in einem Array abspeichert.
    // Gebe danach den Tupel aus

    Random rand = new Random();

    List<Integer> allSpheres = new ArrayList<>();
    for (int i = 1; i < 50; i++) {
        allSpheres.add(i);
    }

    List<Integer> lotterie = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
        
        int randNext = rand.nextInt(0,allSpheres.size());
        lotterie.add(allSpheres.get(randNext));
        allSpheres.remove(randNext);
    }
    

    System.out.println("Die heutige Ziehung der Lottozahlen lautet: \n");
    lotterie.stream().sorted().forEach(System.out::println);
    
    }
}
