// Erstellen Sie ein Programm "Daten" mit folgendem Ablauf:
// Erzeugen Sie ein Array mit 10 ganzzahligen Elementen.
// Geben Sie alle Elemente des Arrays auf dem Bildschirm aus.

public class Daten {
    public static void main(String[] args) {
        
        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        
        // gibt alle Elemente des Arrays aus
        System.out.println("Die Elemente des Arrays sind:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }
    }
}