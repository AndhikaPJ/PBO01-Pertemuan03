package string;

public class OperasiString {
    public static void main(String[] args) {
        String kota ="Banjarmasin";

        System.out.println(kota);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        System.out.println(kota.toUpperCase()); //membuat penulisan abjad menjadi kapital semua
        System.out.println(kota.toLowerCase()); //membuat penulisan abjad menjadi kecil
        System.out.println(kota.substring(5)); //mengambil nilai value dari sebuah string dan menampilkan value tsb mulai index 5(Awal index 0) sampai dgn akhir sebuah value string.
        System.out.println(kota.substring(0,5)); //mengambil nilai value dari sebuah string dan menampilkan value tsb mulai index 0 sampai <5.
    }
}
