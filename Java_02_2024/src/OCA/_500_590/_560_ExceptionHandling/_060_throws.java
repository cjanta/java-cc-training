package _500_590._560_ExceptionHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _060_throws {

    // throws
    // A method throws an exception
    // Wenn in einer Methode eine Checked Exception geworfen werden könnte,
    // muss dies in der Signatur per throws angegeben werden.

    // Checked Exceptions werden beim Compilieren geprüft.

    static void writeToFile() throws IOException {

        FileWriter bw = new FileWriter("test.txt");
        bw.write("Test");
        bw.close();
    }

    // public static void main(String[] args) throws IOException {
    public static void main(String[] args) {

        // writeToFile();

        try {
            writeToFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
