package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                      // variabel i awalny bernilai 0, kemudian i++ (mengalami proses penambahan) segingga i = 1.
        System.out.println(i);   // print i dgn nilai 1
        i++;                    // nilai i sebelumnya =1, lalu variabel i increment. maka hasilnya jadi 1+1=2.
        System.out.println(i);   // print i dgn nilai 2
        i=i+1;                  // karena nilai i sebelumnya 2, maka i = 2 + 1 = 3 , atau sama saja dengan i++ = i=i+1,
        System.out.println(i); // print i dgn nilai 3
    }
}
