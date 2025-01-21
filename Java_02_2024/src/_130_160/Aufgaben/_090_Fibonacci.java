package _130_160.Aufgaben;

import java.util.ArrayList;
import java.util.List;

public class _090_Fibonacci {

    public static void main(String[] args) {

        /*
         * Fibonacci
         *
         * Schreibe ein Programm, das die ersten 10 Zahlen der
         * Fibonacci-Folge ausgibt: 0 1 1 2 3 5 8 13 21 34
         *
         * Die ersten beiden Zahlen dürfen hardcodiert ausgegeben werden.
         *
         * Die Fibonacci-Folge beginnt mit 0 und 1.
         * Ab dann entsteht die folgende Zahl
         * indem man jeweils die beiden vorherigen Zahlen addiert.
         *
         * Zusatz: Gib alle Zahlen unter 500 aus
         */
        fibonacci().stream().forEach(System.out::println);

    }
    private static List<Integer> fibonacci(){
        List<Integer> fibonaccis = new ArrayList<>();
        int limit = 500;
        fibonaccis.add(0);
        fibonaccis.add(1);
        while(fibonaccis.get(fibonaccis.size()-1) < limit){
            int first = fibonaccis.get(fibonaccis.size()-2);
            int second = fibonaccis.get(fibonaccis.size()-1);
            int result = first + second;
            fibonaccis.add(result); 
        }
        return fibonaccis;
    }
}
