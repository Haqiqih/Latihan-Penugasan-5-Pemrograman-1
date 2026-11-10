import java.util.Scanner;

public class CekBentukSegitiga {
    public static void main(String[] args) {
        Scanner bensegi = new Scanner(System.in);
        
        System.out.println("Masukkan panjang sisi A: ");
        double a = bensegi.nextDouble();
        System.out.println("Masukkan panjang sisi B: ");
        double b = bensegi.nextDouble();
        System.out.println("Masukkan panjang sisi C: ");
        double c = bensegi.nextDouble();

        if((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("Segitiga Sama Sisi");
            } else if (a == b || b == c || a == c) {
                System.out.println("Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga Sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga.");
        }

        bensegi.close();
    }
}
