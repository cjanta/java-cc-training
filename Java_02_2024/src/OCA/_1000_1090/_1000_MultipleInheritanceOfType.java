package _1000_1090;

public class _1000_MultipleInheritanceOfType {

    // Type YES
    // Interfaces, classes are "types".
    // Java allows a class to implement multiple interfaces.
    // In this way, Java supports multiple inheritance of types.

    // State NO
    // "State" on the other hand is represented by instance fields.
    // Only a class can have instance fields and therefore only a class ran have a state.
    // Fields defined in an interface are always implicitly static,
    // even if you don't specify the keyword static explicitly
    // Therefore, an interface does not have any state.
    // Since a class is allowed to extend only from one class at the most, it can inherit only one state.
    // Thus, Java does not support multiple inheritance of state.
}
