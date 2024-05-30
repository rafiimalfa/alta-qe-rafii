public class Segitiga {
   double alas;
   double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double luas(){
        double luas = this.alas * this.tinggi / 1/2;
        return luas;
    }
    public double keliling(){
        double sisimiring = Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2);
        double hasilsisi = Math.sqrt(sisimiring);
        double hasil = this.alas + this.tinggi + hasilsisi;
        return hasil;
    }
}

