//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int nilai = scan.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println(" Nilainya adalah A ");
        } else if (nilai >= 65  && nilai <= 79) {
            System.out.println(" Nilainya adalah B+ " );
        } else if (nilai >= 50  && nilai <= 64) {
            System.out.println(" Nilainya adalah B " );
        } else if (nilai >= 35  && nilai <= 49) {
            System.out.println(" Nilainya adalah C " );
        } else if (nilai >= 0  && nilai <= 34) {
            System.out.println(" Nilainya adalah D " );
        } else {
            System.out.println(" Masukkan angka dari 0-100 " );
        }
    }
}