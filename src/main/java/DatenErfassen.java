import java.util.Scanner;

public class DatenErfassen {
    public static void main(String[] args) {
        
        // Abfrage, wie viele Daten erfasst werden sollen
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Abfrage, wie viele Daten erfasst werden sollen
            System.out.print("Wie viele Daten sollen erfasst werden? ");
            int anzahlDaten = scanner.nextInt();
            scanner.nextLine(); // Verbrauch der restlichen Zeile
            // Erstellen eines entsprechend großen String-Arrays
            String[] datenArray = new String[anzahlDaten];
            // Abfragen und Speichern der Daten im Array
            
            for (int i = 0; i < anzahlDaten; i++) {
                System.out.print("Bitte gebe die Daten " + (i + 1) + " ein: ");
                datenArray[i] = scanner.nextLine();
            }   // Ausgabe aller Daten des Arrays
            
            System.out.println("\nDie erfassten Daten sind:");
            for (int i = 0; i < datenArray.length; i++) {
                System.out.println("Daten " + (i + 1) + ": " + datenArray[i]);
            }
            // Scanner schließen
        }
    }
}