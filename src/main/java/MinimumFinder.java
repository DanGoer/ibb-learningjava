// Kapitel 8 Übung 2 Aufgabe 4
// Schreiben Sie eine Methode in Pseudocode, die das Minimum dreier verschiedener Werte
// bestimmt und an das Hauptprogram

public class MinimumFinder {

    // Methode zur Bestimmung des Minimums 
    public static int findMinimum(int a, int b, int c) {
        int min = a;  // Annahme, dass a das Minimum ist

        // Überprüft, ob b ein kleineres Minimum ist
        if (b < min) {
            min = b;
        }

        // Überprüft, ob c ein kleineres Minimum ist
        if (c < min) {
            min = c;
        }

        return min; 
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 7;

        // Aufruf der Methode, um das Minimum zu finden
        int minimum = findMinimum(num1, num2, num3);

        System.out.println("Das Minimum von " + num1 + ", " + num2 + " und " + num3 + " ist: " + minimum);
    }
}