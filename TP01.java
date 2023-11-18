import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputAngka = sc.nextInt();

        sc.close();
        if (inputAngka <= 100 && inputAngka >= 1) {
            for (int i = 1; i <= inputAngka; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " Genap");
                } else {
                    System.out.println(i + " Ganjil");
                }
            }
        } else {
            System.out.println("Inputan tidak valid");
        }
    }
}
