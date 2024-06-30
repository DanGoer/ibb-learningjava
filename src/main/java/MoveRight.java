// Kapitel 8 Übung 1 Aufgabe 1 + 2
// Schreiben Sie eine Prozedur in Pseudocode, die alle Elemente eines Feldes um jeweils eine
// Position nach rechts verschiebt. Das letzte Element soll das erste Element werden. 
// Setzen Sie den Pseudocode aus Aufgabe 1 in Java-Code um, wobei Sie dann eine Methode
// ohne Rückgabewert statt einer Prozedur erstellen. 

public class MoveRight {
public static void main(String[] args) {
         int[] array = {1, 2, 3, 4, 5};

        System.out.println("Originales Array:");
        printArray(array);

        // Aufruf der Methode zum Verschieben der Elemente
        shiftRight(array);

        System.out.println("Verschobenes Array:");
        printArray(array);
    }

    // Methode zum Verschieben der Elemente um eine Position nach rechts
    public static void shiftRight(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Keine Verschiebung notwendig für leere oder ein-elementige Arrays
        }

        int lastElement = array[array.length - 1]; // Speichere das letzte Element

        // Verschiebe alle Elemente um eine Position nach rechts
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement; // Setze das letzte Element an die erste Position
    }

    // Hilfsmethode zum Drucken des Arrays
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
}

    