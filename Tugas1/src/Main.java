import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan alas  : ");
        float alas = input.nextFloat();


        System.out.print("Masukan tinggi : ");
        float tinggi = input.nextFloat();

        float luas = alas * tinggi / 2;

        System.out.println("luas segitiga adalah : " + luas);
    }
}