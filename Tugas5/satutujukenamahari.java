import java.util.Scanner;
public class satutujukenamahari {
    public static void main(String[] args) {
        Scanner sari = new Scanner(System.in);
        System.out.println("Masukkan angka (1-7): ");
        int pilihan = sari.nextInt();
 
        switch (pilihan){
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                 System.out.println("Hari Selasa");
                 break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jum'at");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Angka kelebihan ! Masukkan angka antara 1-7");
                break;
        }
        sari.close();
    }
}