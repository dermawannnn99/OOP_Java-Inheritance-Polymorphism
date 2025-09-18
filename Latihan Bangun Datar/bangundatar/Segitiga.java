package bangundatar;

public class Segitiga extends BangunDatar {
    double alas, tinggi;
    double sisi1, sisi2, sisi3;

    // Constructor 3 parameter (alas, tinggi, sisi miring)
    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = alas;
        this.sisi2 = tinggi;
        this.sisi3 = sisiMiring;
    }

    // Constructor 5 parameter (alas, tinggi, semua sisi)
    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return sisi1 + sisi2 + sisi3;
    }
}
