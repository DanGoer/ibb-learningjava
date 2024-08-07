// Kapitel 8 Übung 1 Aufgabe 3
// Erstellen Sie eine Prozedur in Pseudocode, der als Parameter der Radius einer Kugel übergeben wird. In der Prozedur sind der Umfang der Kugel, die Mantelfläche und das Volumen
// zu berechnen. Die Werte sollen anschließend dem aufrufenden Programm zur Verfügung
// stehen.
// Umfang einer Kugel (Kreis): 2*Π*R Π entspricht der Konstanten Pi = 3.14
// Mantelfläche der Kugel: 4*Π*R2 R entspricht dem Radius
// Volumen einer Kugel: 4 / 3*Π*R3

public class KugelBerechnung {
    
    // Methode zur Berechnung des Umfangs, der Mantelfläche und des Volumens einer Kugel
    public static void berechneKugelWerte(double radius, double[] ergebnisse) {
    // Pi
    double pi = 3.14;


    
    // Umfang
    double umfang = pi * radius;
    
    // Mantefläche
    double mantelfläche = 4 * Math.pow(radius,2) * pi;
    
    // Volumen
    double volumen = (4/3) * pi * Math.pow(radius,3);
    
    // Ergebnisse an den jeweiligen stellen im Array speichern
    ergebnisse[0] = umfang;
    ergebnisse[1] = mantelfläche;
    ergebnisse[2] = volumen;

 }



public static void main(String[] args) {
    double radius = 6.0; // Hier kann der radius verändert werden
    double[] ergebnisse = new double[3]; // Hier wird das Array erstellt zum speichern der berechneten Werte
    // Hier wird die Methode zur Berechnung der Kugel von vorher aufgerufen
    berechneKugelWerte(radius, ergebnisse);

    // Ausgabe der Ergebnisse
    System.out.println("Umfang: " + ergebnisse[0]);
    System.out.println("MantelFläche: " + ergebnisse[1]);
    System.out.println("Volumen: " + ergebnisse[2]);
}
}