
public class DurchDreiTeilbareZahlen {
public static void main(String[] args) {
        System.out.println("Ausgabe Zählschleife for-Schleife:");
        forSchleife();

        System.out.println("\nAusgabe kopfgesteuerte Schleife while-Schleife:");
        whileSchleife();

        System.out.println("\nAusgabe fußgesteuerte Schleife do-while-Schleife:");
        doWhileSchleife();
    }

    // Zählschleife 
    public static void forSchleife() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    // Kopfgesteuert
    public static void whileSchleife() {
        int i = 1;
        while (i <= 20) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // Fußgesteuert
    public static void doWhileSchleife() {
        int i = 1;
        do {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }
}
