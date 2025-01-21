package _600_690;

public class _670_LoopLabel {

    public static void main(String[] args) {

        // Label in Schleifen
        // Ein Label ist nur in dem Scope danach gültig

        // break
        int counter = 0;
        for (int i = 1; i <= 10; i++) {
            loop:
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 10; k++) {
                    if (j == 5) break loop;  // 400
                    counter++;
                }
            }
        }
        System.out.println(counter);

        // continue
        label1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 1; j < 6; j++) {
                System.out.print("#");
                if (j > i) continue label1;
            }
        }
        System.out.println();

        int counter2 = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        break middle;
                    }
                    counter2++;
                }
            }
        }
        System.out.println(counter2);  // 3


    }
}

