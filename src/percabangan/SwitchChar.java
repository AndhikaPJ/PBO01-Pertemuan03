package percabangan;

public class SwitchChar {
    public static void main(String[] args) {
    char nilai = 'C';

        switch (nilai) {
            case 'A':
                System.out.println("Mahasiswa : \"Suwun Pak!\"");
                System.out.println("Dosen     : \"Inggh, Sama-sama.\"");
                break;

            case 'B':
                System.out.println("Mahasiswa : \"Nilai Saya Koq Cuman Dapat B, Pak!\"");
                System.out.println("Dosen     : \"Mau tak ganti C?\"");
                System.out.println("Mahasiswa : \"Arrghhh!!!, Ayuja jangan giin Pak ai. Makasih Pak!\"");
                break;

            case 'C':
                System.out.println("Mahasiswa : \"Napa uluns dapat C, Pak? Maka uluns kerjakan semua tugas yang pian kasih!\"");
                System.out.println("Dosen     : \"Yaqinnn Lah?? Absen pang ikam kyp? Rancak masuk kadakk!!!\"");
                System.out.println("Mahasiswa : \"Nah,, ulun masuk trus Pak ai\"");
                System.out.println("Mahasiswa : \"tapi boong... wwkkwkw\"");
                break;

            default:
                System.out.println("Semoga Bahagia :')!");
                break;
        }
    }
}
