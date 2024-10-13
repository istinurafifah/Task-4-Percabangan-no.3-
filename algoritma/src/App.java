import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double nilai = input.nextDouble();
        System.out.println("nilai anda = " + nilai);

        if ( nilai >= 85) {
            System.out.println("Predikat A");

        } else if (nilai < 85 && nilai >= 75) {
            System.out.println("Predikat B");
            
        } else if (nilai < 75 && nilai >= 55) {
            System.out.println("Predikat C");
            
        } else {
            System.out.println("Predikat D");
        }
          
        input.close();

    }
}
