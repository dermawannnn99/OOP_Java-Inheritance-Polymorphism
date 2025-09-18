public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih m = new MatematikaCanggih();

        //angka inputan
        int a = 20, b = 7;

        //tampilkan
        System.out.println("20 + 7 = " + m.tambah(a, b));
        System.out.println("20 - 7 = " + m.kurang(a, b));
        System.out.println("20 x 7 = " + m.kali(a, b));
        System.out.println("20 / 7 = " + m.bagi(a, b));
        System.out.println("20 % 7 = " + m.modulus(a, b));
    }
}
