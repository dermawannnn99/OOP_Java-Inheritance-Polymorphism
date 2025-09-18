public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget m = new MatematikaCanggihBanget();

        //ini angka inputan yeah
        int a = 10, b = 5, c = 7;

        System.out.println("10 + 5 = " + m.tambah(a, b));         // dari Matematika
        System.out.println("10 x 5 = " + m.kali(a, b));           // dari Matematika
        System.out.println("10 % 5 = " + m.modulus(a, b));        // dari MatematikaCanggih
        System.out.println("10 + 5 + 7 = " + m.pertambahanTiga(a, b, c)); // dari MatematikaCanggihBanget
    }
}
