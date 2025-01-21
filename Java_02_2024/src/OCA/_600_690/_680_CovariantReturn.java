package _600_690;

// Covariant return
// Beim Überschreiben (overriding) darf der return type auch eine Subklasse sein.

class Insekt {
}

class Schmetterling extends Insekt {
}

class Mensch {
    Insekt rettet() {
        return new Insekt();
    }
}

class Biologe extends Mensch {

    // Der gleiche return type geht IMMER
    // @Override
    // Insekt rettet() { return new Insekt(); }

    // Ein Subklasse geht auch als return type
    @Override
    Schmetterling rettet() {
        return new Schmetterling();
    }

    // Ein anderer return type geht NIE
    // String rettet() { return "Insekt"; }
    // return type java.lang.String is not compatible with ...Insekt

}

public class _680_CovariantReturn {
    public static void main(String[] args) {
    }
}
