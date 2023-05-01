import java.util.Scanner;
//Muhhamad Wildan Nugroho IF09O 21102022
public class UG_1{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("================================================");
            System.out.println("\t Program Menampilkan Bilangan Genap");
            System.out.println("Nama    : Muhhamad Wildan Nugroho");
            System.out.println("Kelas   : IF 09 O");
            System.out.println("NIM     : 21102022");
            System.out.println("================================================");
            System.out.print("Masukkan Batas Bilangan :   ");
            Integer even = input.nextInt();

            for(int i = 1; i<= even; i++){
                if(i % 2 == 0){
                    System.out.print("\n Bilangan Genap : " + i);
                }
            }
        }
    }
}