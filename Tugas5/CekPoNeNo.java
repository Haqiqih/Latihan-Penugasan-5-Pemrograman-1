import java.util.Scanner;
public class CekPoNeNo {
    public static void main(String[] args){
      Scanner  poneno = new Scanner(System.in);
        System.out.println("Masukkan sebuah Angka : ");
        double angka = poneno.nextDouble();

        if(angka > 0){
            System.out.println("Angka tersebut adalah Positif.");
        }else if (angka < 0 ) {
            System.out.println("Angka tersebut adalah Negatif.");
        }else {
            System.out.println("Angka tersebut adalah Nol.");
        }
        poneno.close();
    }

}
