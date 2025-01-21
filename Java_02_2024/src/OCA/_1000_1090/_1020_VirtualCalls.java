package _1000_1090;

public class _1020_VirtualCalls {

    // A virtual call means that the call is bound to a method at run time and not at compile time.
    // In Java, all non-private and non-final instance method calls are virtual.
    // This is important because, at run time,
    // a reference variable may point to an instance of a subclass of the class of the reference.
    // The compiler doesn't have the knowledge
    // lof the class of the actual object being referred to by the reference variable.
    // If the subclass overrides the method,
    // the call becomes polymorphic because now there are two versions of the method that can be invoked
    // (the base class version and the subclass version).
    // Therefore, the compiler is unable to bind the call to the method of a specific class.
    // Only the JVM has the necessary information to bind the call.
    // The JVM knows the class of the actual object and it binds the call to
    // the method of that class. This behavior is called polymorphism.
    // Thus, in Java, all non-private and non-final instance method calls are potentially polymorphic
    // because there could be multiple versions of the method eligible to be invoked.

    // Enthuware v8.2.1215
}
