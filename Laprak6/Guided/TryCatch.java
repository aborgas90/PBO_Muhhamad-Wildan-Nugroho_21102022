package Guided;

public class TryCatch {
    public static void main(String[] args) {
        //membuat array
        int [] angka = {1,2,3,4,5};

        // //memanggil array
        try {
            System.out.println(angka[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index yang dimasukkan melebihi kapasitas");
        }
        System.out.println("Akhir dari Program");
    }
}


