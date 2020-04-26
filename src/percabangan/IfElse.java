package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 53000;

        if (uangDiDompet < totalBelanja) { //kondisi 1
            System.out.println("Nah duitnya kada mayu, kurangi belanjaanya!"); //statement 1
        } else if (uangDiDompet > totalBelanja){ //kondisi 2
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Duit cukup, nah angsulannya "+angsul); //statement 2
        } else {
            System.out.println("Nah, duitny pas jeh!"); //statement 3

            //Ketika kondisi 1 terpenuhi, maka statement 1 dieksekusi dan break. ketika kondisi 1 tidak terpenuhi, maka akan lnjut cek ke kondisi 2
            //dan jika terpenuhi maka akan dieksekusi statement 2 atau 3
        }
    }
}
