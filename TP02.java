import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputAngka = sc.nextInt();
        int hasilFatorial = 1;

        for (int i = 1; i <= inputAngka; i++) {
            hasilFatorial *= i; // mengalikan tiap iterasi/looping dengan hasil sebelumnya
            System.out.println(hasilFatorial);

        }
        System.out.println(hasilFatorial);
    }
}
