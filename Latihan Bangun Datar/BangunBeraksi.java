import bangunruang.*;
import bangundatar.*;

public class BangunBeraksi {
    public static void main(String[] args) {
        //ini bangun datar
        Persegi persegi = new Persegi(5);
        PersegiPanjang pp = new PersegiPanjang(7, 4);
        Lingkaran lingkaran = new Lingkaran(3);
        Segitiga segitiga1 = new Segitiga(6, 4, 5);             // segitiga versi 3 parameter
        Segitiga segitiga2 = new Segitiga(6, 4, 5, 5, 7);       // segitiga versi 5 parameter

        //ini bangun ruang
        Kubus kubus = new Kubus(4);
        Balok balok = new Balok(6, 4, 3);
        Tabung tabung = new Tabung(3, 6);
        Prisma prisma = new Prisma(5, 3, 6);

        //pemanis
        System.out.println("=====================================================");
        System.out.println("              HASIL PERHITUNGAN BANGUN               ");
        System.out.println("=====================================================\n");

        //tabel bangun datar agar rapi
        System.out.println(">>> Bangun Datar <<<");
        System.out.printf("%-20s | %-10s | %-10s\n", "Nama", "Luas", "Keliling");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-20s | %-10.2f | %-10.2f\n", "Persegi", persegi.luas(), persegi.keliling());
        System.out.printf("%-20s | %-10.2f | %-10.2f\n", "Persegi Panjang", pp.luas(), pp.keliling());
        System.out.printf("%-20s | %-10.2f | %-10.2f\n", "Lingkaran", lingkaran.luas(), lingkaran.keliling());
        System.out.printf("%-20s | %-10.2f | %-10.2f\n", "Segitiga (3 param)", segitiga1.luas(), segitiga1.keliling());
        System.out.printf("%-20s | %-10.2f | %-10.2f\n", "Segitiga (5 param)", segitiga2.luas(), segitiga2.keliling());

        System.out.println();

        //tabel bangun ruang
        System.out.println(">>> Bangun Ruang <<<");
        System.out.printf("%-20s | %-12s | %-15s\n", "Nama", "Volume", "Luas Permukaan");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-20s | %-12.2f | %-15.2f\n", "Kubus", kubus.volume(), kubus.luasPermukaan());
        System.out.printf("%-20s | %-12.2f | %-15.2f\n", "Balok", balok.volume(), balok.luasPermukaan());
        System.out.printf("%-20s | %-12.2f | %-15.2f\n", "Tabung", tabung.volume(), tabung.luasPermukaan());
        System.out.printf("%-20s | %-12.2f | %-15.2f\n", "Prisma", prisma.volume(), prisma.luasPermukaan());

        System.out.println("\n=====================================================");
        System.out.println("                      SELESAI                        ");
        System.out.println("=====================================================");
    }
}
