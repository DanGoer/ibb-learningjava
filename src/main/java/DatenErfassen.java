// Erstellen Sie ein Programm "DatenErfassen" mit folgendem Ablauf:
// Es erfolgt zuerst eine Abfrage, wieviele Daten erfasst werden sollen.
// Es wird ein entsprechend großes String-Array erzeugt.
// Nun werden alle Daten abgefragt und im Array gespeichert.
// Abschließend werden alle Daten des Arrays ausgegeben.


import java.util.Scanner;

public class DatenErfassen {
    public static void main(String[] args) {
        
        // Abfrage, wie viele Daten erfasst werden sollen
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Abfrage, wie viele Daten erfasst werden sollen
            System.out.print("Wie viele Daten sollen erfasst werden? ");
            int anzahlDaten = scanner.nextInt();
            scanner.nextLine(); 
            // Erstellen eines entsprechend großen String-Arrays
            String[] datenArray = new String[anzahlDaten];
            // Abfragen und Speichern der Daten im Array
            
            for (int i = 0; i < anzahlDaten; i++) {
                System.out.print("Bitte gebe die Daten " + (i + 1) + " ein: ");
                datenArray[i] = scanner.nextLine();
            }   
            
            // Ausgabe
            System.out.println("\nDie erfassten Daten sind:");
            for (int i = 0; i < datenArray.length; i++) {
                System.out.println("Daten " + (i + 1) + ": " + datenArray[i]);
            }
            // Scanner schließt
        }
    }
}