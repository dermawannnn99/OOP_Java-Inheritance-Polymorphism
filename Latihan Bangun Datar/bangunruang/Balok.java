package bangunruang;

public class Balok extends BangunRuang {
    double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (p * l + p * t + l * t);
    }

    @Override
    public double volume() {
        return p * l * t;
    }
}
