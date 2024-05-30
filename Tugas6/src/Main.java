import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai :" );
        int n = input.nextInt();
        isi(n);


    }
    public static void isi (int n){
        int huruf = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               huruf++;
                if (huruf % 3 == 0 ) {
                    System.out.print("x");
                } else if (huruf % 2 == 0) {
                    System.out.print("z");
                } else
                    System.out.print("y");
            }
            System.out.println();

        }
    }
}