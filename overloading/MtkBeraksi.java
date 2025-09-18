public class MtkBeraksi {
    public static void main(String[] args) {
        // Buat objek MtkCanggih dengan identitas
        MtkCanggih m = new MtkCanggih("2410631170038", "Dermawan");

        // Cetak identitas
        System.out.println("NIM   : " + m.nim);
        System.out.println("Nama  : " + m.nama);
        System.out.println();

        //uji overloading pertambahan & pengurangan
        System.out.println("Pertambahan (12.5, 28.7, 14.2) = " + m.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (23, 34.5) = " + m.pertambahan(23, 34.5));
        System.out.println("Pengurangan (12.6, 28, 14) = " + m.pengurangan(12.6, 28, 14));
        System.out.println("Pengurangan (3.4, 9) = " + m.pengurangan(3.4, 9));

        System.out.println();
        //ini uji method tambahan, perkalian, pembagian, modulus
        System.out.println("Perkalian (7, 8) = " + m.perkalian(7, 8));
        System.out.println("Pembagian (28, 7) = " + m.pembagian(28, 7));
        System.out.println("Modulus (29, 7) = " + m.modulus(29, 7));
    }
}
