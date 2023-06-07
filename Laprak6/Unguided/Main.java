package Unguided;

import java.util.InputMismatchException;
import java.util.Scanner;
//Muhhamad Wildan Nugroho (IF09 O)-21102022
public class Main {
    public static int jumlahBilangan(int input_first,int input_second) {
            return input_first + input_second;
        };
    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            int firstNumber;
            int secondNumber;
            int Result;
            int division;

            try {
                System.out.print("Masukkan Bilangan Bulat Pertama :");
                firstNumber = Input.nextInt();
                System.out.print("Masukkan Bilangan Bulat Kedua :");
                secondNumber = Input.nextInt();

                Result = jumlahBilangan(firstNumber, secondNumber);
                System.out.println("Hasil dari Penjumlahan : " + Result);

                division = firstNumber / secondNumber;
                System.out.println("Hasil dari Pembagian:" + division);

            } catch (InputMismatchException e) {
                System.out.println("Error : Input tida valid. Harap masukkan bilangan bulat");
            }catch(ArithmeticException e){
                System.out.println("Error : Angka nol tidak boleh di gunakan untuk pembagian ");
            }
            catch(Exception e ){
                System.out.println("Error:" + e.getMessage());
            }
        }
    }
}
