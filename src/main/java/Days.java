import java.time.DayOfWeek;
import java.time.LocalDate;

public class Days {

    public static void main(String[] args) {
        // Zum herausfinden des aktuellen Jahres
        int entsprechendesJahr = LocalDate.now().getYear();
        // Zum herausfinden des vorherigen Jahres (Kommentar entfernen)
        // int entsprechendesJahr = LocalDate.now().getYear() - 1;

        // Durchläuft jeden Monat des aktuellen Jahres
        for (int monat = 1; monat <= 12; monat++) {
            LocalDate ersterTagImMonat = LocalDate.of(entsprechendesJahr, monat, 1);
            DayOfWeek wochentag = ersterTagImMonat.getDayOfWeek();
            
            // Überprüft ob der Wochentag ein Sonntag ist
            if (wochentag == DayOfWeek.SUNDAY) {
                System.out.println("Der 1. " + ersterTagImMonat.getMonth() + " ist ein Sonntag.");
            }
        }
    }
}
