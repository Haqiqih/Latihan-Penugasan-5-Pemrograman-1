import java.util.Scanner;

public class kalkulatorsederhana {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
    
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Angka Pertama = ");
        double a = in.nextDouble();

        System.out.println("Masukan Operatornya = ");
        char op = in.next().charAt(0);

        System.out.println("Masukan Angka Kedua = ");
        double b = in.nextDouble();

        switch (op) {
        case '+': 
        System.out.println(a + b); 
        break;
        
        case '-': 
        System.out.println(a + " - " + b + " = " + (a - b)); 
        break;
        
        case '*': System.out.println(a * b); 
        break;
        
        case '/':
            if (b == 0){
                System.out.println("Tidak bisa dibagi nol");
            }else
                System.out.println(a / b);
            break;

        default: System.out.println("Operator tidak dikenal");
}

    }
}
