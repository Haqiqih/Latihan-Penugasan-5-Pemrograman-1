import java.util.Scanner;
public class CekGradeAkeD {
    public static void main(String[] args) {
        Scanner aked = new Scanner(System.in);
        System.out.println("Masukkan nilai angka (0-100): ");
        int nilai = aked.nextInt();
        char grade;

        if (nilai>= 85){
            grade = 'A';
        } else if (nilai>= 70){
            grade = 'B';
        } else if (nilai>= 55){
            grade = 'C';
        } else {
            grade = 'D';
        }

        String status = (nilai >= 55) ? "Lulus" : "Tidak Lulus";

        System.out.println("Grade Kamu: " + grade);
        System.out.println("Status: " + status);
        aked.close();

    }

}
