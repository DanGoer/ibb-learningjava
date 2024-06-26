public class SucheNach13 {
    public static void main(String[] args) {
        
        int[] numbers = {0, 10, 12, 4, 7, 20, 21, 13};
        
        // speichert die Position der gesuchten Variable
        int position = -1;

        // Durchläuft das Array 
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 13) {
                position = i;
                break; 
            }
        }

        
        if (position != -1) {
            System.out.println("Die Zahl 13 wurde an Position " + position + " gefunden.");
        } else {
            System.out.println("Die Zahl 13 wurde nicht im Array gefunden.");
        }
    }
}