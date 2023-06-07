package Guided;

import java.util.InputMismatchException;
import java.util.Scanner;
//Muhhamad Wildan Nugroho (IF09 O)-21102022
public class MultipleCatch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            try {
                System.out.println("Masukkan Angka :");
                int angka1 = input.nextInt();

                System.out.println("Masukkan Angka Pembagi:");
                int angka2 = input.nextInt();

                int hasil = angka1 / angka2;
                System.out.println(angka1 + "/" + angka2 + "=" + hasil + " (dibulatkan)");
            } catch (ArithmeticException e) {
                System.out.println("Error: Kesalahan dalam perihitungan");
            } catch (InputMismatchException e) {
                System.out.println("Error: Kesalahan dalam input!");
            }finally{
                System.out.println("Finally akan selalu dijalankan");
            }
            System.out.println("Akhir dari program");
        }
    }
}

