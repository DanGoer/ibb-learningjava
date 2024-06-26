// Erstellen Sie ein Programm "Statistik" mit folgendem Ablauf:
// Es erfolgt zunächst eine Abfrage, wieviele Daten für die Statistik ausgewertet werden sollen.
// Erzeugen Sie nun ein entsprechend großes Array für Gleitkommazahlen.
// Nun werden die einzelnen Daten abgefragt und im Array gespeichert.
// Ermitteln Sie aus allen Daten die Summe und den Mittelwert und geben Sie die Ergebnisse zusammen
// mit der Anzahl der Daten auf dem Bildschirm aus (z.B. "Es wurden 8 Daten erfasst, die Summe = 37,273 und der Mittelwert = 4,659125").

import java.util.Scanner;

public class Statistik {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Abfrage
        System.out.print("Wie viele Daten sollen für die Statistik ausgewertet werden? ");
        int anzahlDaten = scanner.nextInt();

        // Erzeugt das Array
        double[] datenArray = new double[anzahlDaten];
        
        // Abfrage + Speichern der Daten
        for (int i = 0; i < anzahlDaten; i++) {
            System.out.print("Geben Sie Daten " + (i + 1) + " ein: ");
            datenArray[i] = scanner.nextDouble();
        }
        
        // Berechnungen
        double summe = 0.0;
        for (int i = 0; i < datenArray.length; i++) {
            summe += datenArray[i];
        }
        double mittelwert = summe / anzahlDaten;
        
        // Ausgabe der Ergebnisse
        System.out.print("Es wurden" + anzahlDaten + " Daten erfasst, die Summe ist = " + summe + " und der Mittelwert =" + mittelwert );
        
    }
    
}
