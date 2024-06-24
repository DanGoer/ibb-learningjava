package com.mycompany.divideby5;

import java.util.Scanner;

public class DivideBy5 {
    public static void main(String[] args) {
        int number = readInt("Zahl: ");
        int count = 0;

        // Zählt, wie oft die Zahl durch 5 geteilt werden kann
        while (number % 5 == 0 && number != 0) {
            number = number / 5;
            count++;
        }

        // Ausgabe der Anzahl der Divisionen
        System.out.println("Die Zahl kann " + count + " Mal durch 5 geteilt werden.");
    }

    // Funktion zum Einlesen einer Zahl über die Standardeingabe
    public static int readInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Bitte gebe eine Zahl ein.");
            scanner.next(); // ungültige Eingabe ignorieren
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}