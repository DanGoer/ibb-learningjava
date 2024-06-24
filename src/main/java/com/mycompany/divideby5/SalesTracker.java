package com.mycompany.divideby5;

import java.util.Scanner;

public class SalesTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variablen zur Speicherung der Anzahl verkaufter Produkte der Warengruppe 7 in Filiale 9
        int totalSalesWarengruppe7Filiale9 = 0;
        
        // Eingabe der Daten
        while (true) {
            System.out.print("Filialnummer eingeben (oder -1 zum Beenden): ");
            int filialnummer = scanner.nextInt();
            if (filialnummer == -1) {
                break;
            }

            System.out.print("Warengruppe eingeben: ");
            int warengruppe = scanner.nextInt();

            System.out.print("Stückzahl eingeben: ");
            int stueck = scanner.nextInt();

            System.out.print("Verkaufsdatum eingeben (z.B. 2024-05-31): ");
            String verkaufsdatum = scanner.next();

            // Überprüft ob die Eingabe für Filiale 9 und Warengruppe 7 ist
            if (filialnummer == 9 && warengruppe == 7) {
                totalSalesWarengruppe7Filiale9 += stueck;
            }
        }
        
        // Ergebnis ausgeben
        System.out.println("In Filiale 9 wurden " + totalSalesWarengruppe7Filiale9 + " Produkte der Warengruppe 7 verkauft.");
    }
}
