import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kalimat = in.nextLine();
        String dibalik = "";

        palindrome(kalimat, dibalik);

    }

     public static void palindrome(String kalimat, String dibalik) {
        int length = kalimat.length();
        for (int i = length-1; i>=0; i--) {
          dibalik = dibalik + kalimat.charAt(i);
        }
        if (kalimat.equals(dibalik)) {
            System.out.println("true");
        } else
            System.out.println("false");
     }

}