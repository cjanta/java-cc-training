package _301_LF12aV2;

import java.util.Stack;

public class _321_Stack {
    public static void main(String[] args) {
        // Stack
        // Grundbaustein der Appentwicklung
        Stack<String> stack = new Stack<>();

        // Elemente hinzufügen (push)
        stack.push("Window1");
        stack.push("Window2");
        stack.push("Window3");

        // Ausgabe des Stacks
        System.out.println("Stack: " + stack);

        // Oberstes Element abrufen (peek)
        String top = stack.peek();
        System.out.println("Oberstes Element: " + top);

        // Oberstes Element entfernen (pop)
        String removed = stack.pop();
        System.out.println("Entferntes Element: " + removed);

        // Ausgabe des aktualisierten Stacks
        System.out.println("Stack nach pop(): " + stack);
    }
}
