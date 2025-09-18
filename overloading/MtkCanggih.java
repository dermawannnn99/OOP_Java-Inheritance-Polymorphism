public class MtkCanggih extends Mtk {
    String nim;
    String nama;

    //konstruktor dengan parameter NIM & Nama
    public MtkCanggih(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        return a / b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }
}
