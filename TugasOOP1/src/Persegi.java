public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public int luas() {
      int luas = this.sisi * this.sisi;
        return luas;
    }
    public int keliling() {
       int keliling = 4 * this.sisi;
        return keliling;
    }
}

