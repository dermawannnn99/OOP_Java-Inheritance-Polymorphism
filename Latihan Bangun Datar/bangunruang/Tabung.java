package bangunruang;

public class Tabung extends BangunRuang {
    double r, t;

    public Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * r * (r + t);
    }

    @Override
    public double volume() {
        return Math.PI * r * r * t;
    }
}
