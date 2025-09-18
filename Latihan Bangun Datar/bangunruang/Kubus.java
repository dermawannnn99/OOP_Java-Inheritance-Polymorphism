package bangunruang;

public class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }
}
