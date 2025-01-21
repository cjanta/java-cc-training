package _301_LF12aV2;

import java.util.LinkedList;

/**
 * Simuliere eine einfache Texteditor-App mit Undo-Funktionalität.
 * Es wird eine LinkedList für die Undo-Operationen verwendet.
 */
public class TextEditor {
    private String aktuellerText = "";
    private LinkedList<String> undoVerlauf = new LinkedList<>();

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.textHinzufuegen("Hallo");
        editor.textHinzufuegen(" Welt");
        System.out.println("Aktueller Text: " + editor.aktuellerText);
        editor.undo();
        System.out.println("Nach Undo: " + editor.aktuellerText);
        editor.textHinzufuegen(" Leute");
        System.out.println("Aktueller Text: " + editor.aktuellerText);
        editor.undo();
        System.out.println("Nach Undo: " + editor.aktuellerText);
        editor.historyZeigen();
    }

    public void textHinzufuegen(String neuerText) {
        // Todo
    }

    public void undo() {
        // Todo
    }

    public void historyZeigen() {
        // Todo
    }
}
