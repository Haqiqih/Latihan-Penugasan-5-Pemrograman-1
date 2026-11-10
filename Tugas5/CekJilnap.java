import java.util.Scanner;

public class CekJilnap {
    public static void main(String[] args) {
         
    Scanner ganjilgenap = new Scanner(System.in);
    System.out.println("Masukkan sebuah angka : ");
    int angka = ganjilgenap.nextInt();

    if (angka %2 == 0){
        System.out.println(angka + " adalah angka Genap.");
        
    } else {
        System.out.println(angka + " adalah angka Ganjil.");
    }
    ganjilgenap.close();
       

    }
}