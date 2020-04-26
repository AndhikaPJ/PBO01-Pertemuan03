package percabangan;

public class Switch {
    public static void main(String[] args) {
        int JJ = 6;

        //Karena variabel JJ diisi 3, maka ketika di compile akan memilih case no 3
        //jika pilihan case out of daftar pilihan. Opsi default yang akan di eksekusi
        switch (JJ) {
            case 1:
                System.out.println("Becari Bukaan Puasa");
                break;

            case 2:
                System.out.println("Nukar Es Nyiur");
                break;

            case 3:
                System.out.println("Nnton Orang Pcaran");
                break;

            case 4:
                System.out.println("Handak ke ATM");
                break;

            default:
                System.out.println("Nah, Sasat am di Jalan");
                break;
        }
    }
}
