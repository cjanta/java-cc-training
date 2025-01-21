package _700_790;

import java.util.ArrayList;
import java.util.stream.Stream;

public class _710_Stream {

    // Stream
    // Kann man nur einmal auslesen

    public static void main(String[] args) {

        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(7);
        zahlen.add(11);
        zahlen.add(19);
        zahlen.add(23);
        zahlen.add(42);

        Stream<Integer> stream = zahlen.stream();
        System.out.println(stream);  // java.util.stream.ReferencePipeline$Head@74a14482

        // filter()
        // Um einzelne Elemente raus zu filtern
        stream = stream.filter(z -> z > 15);
        stream.forEach(e -> System.out.print(e + " "));  // 19 23 42
        System.out.println();
        // stream.forEach(e -> System.out.print(e + " "));
        // IllegalStateException: stream has already been operated upon or closed

        // Als Einzeiler
        zahlen.stream().filter(z -> z % 2 == 0).forEach(e -> System.out.print(e + " "));  // 42
        System.out.println();

        // map()
        // Um die Elemente zu verändern
        zahlen.stream().map(z -> z * z).forEach(e -> System.out.print(e + " "));  // 49 121 361 529 1764
        System.out.println();

        zahlen.stream().filter(z -> z < 20).map(z -> z * z).forEach(e -> System.out.print(e + " "));  // 49 121 361
        System.out.println();

        zahlen.stream().filter(z -> z < 20).map(z -> {
            z += 2;
            return z * z;
        }).forEach(e -> System.out.print(e + " "));  // 81 169 441

    }
}
