package _210_260;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _010_EinmaligesInList {
    public static void main(String[] args) {
    //Einmaliges in einer Liste
    //
    // Schreibe eine Funktion, die eine ArrayList mit neun Zahlen befüllt.
    // Dabei sollen vier Zahlen doppelt vorkommen
    // und eine Zahl nur einmal.
    //
    // Mische dann die ArrayList mit eine integrierten Funktion die du noch finden musst
    //
    // Schreibe dann eine Methode, die aus dieser ArrayList die Zahl findet,
    // die nur einmal vorkommt.

    List<Integer> filledArray = getFilledArray();

    Map<Integer, Long> collected = filledArray.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    System.out.println("Array mit neun Zahlen, eine sollte einzigartig sein der Rest hat Dubletten.\n");
    filledArray.stream().forEach(System.out::println);
     
    System.out.println("Die Zahlen im Array welche nur einmal vorkommt:");
    collected.entrySet().stream().map(Entry::getKey).forEach(System.out::println);

    }

    private static List<Integer> getFilledArray(){
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        do{
            int next =0;
            for (int i = 0; i < 8; i +=2) {
                if (i % 2 == 0){
                    next = rand.nextInt(0,1001);
                }
                numbers.add(next);
                numbers.add(next);
            }
            numbers.add(rand.nextInt(0,1001));
            Collections.shuffle(numbers);

        } while(numbers.stream().distinct().count() != 5);
 
        return numbers;       
    }


    
}
