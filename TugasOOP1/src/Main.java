// import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Persegi satu = new Persegi (4);
        System.out.println("hasil luas Persegi " + satu.luas());
        System.out.println("hasil keliling Persegi " + satu.keliling());

        Segitiga dua = new Segitiga(3,4);
        System.out.println("hasil luas Segitiga= " + dua.luas());
        System.out.println("hasil keliling Segitiga= " + dua.keliling());

        Persegipanjang tiga = new Persegipanjang(7,8);
        System.out.println("hasil luas persegi panjang= " + tiga.luas());
        System.out.println("hasil keliling persegi panjang= " + tiga.keliling());



    }

}