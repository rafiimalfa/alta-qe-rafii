public class Persegipanjang {
    int panjang;
    int lebar;

    public Persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int luas() {
        int luas = this.panjang * this.lebar;
        return luas;
    }
    public int keliling() {
        int keliling = 2 * (this.panjang + this.lebar);
        return keliling;
    }
}
