package bangunruang;

public class Prisma extends BangunRuang {
    double luasAlas, kelilingAlas, tinggi;

    public Prisma(double luasAlas, double kelilingAlas, double tinggi) {
        this.luasAlas = luasAlas;
        this.kelilingAlas = kelilingAlas;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        return (2 * luasAlas) + (kelilingAlas * tinggi);
    }

    @Override
    public double volume() {
        return luasAlas * tinggi;
    }
}
