import java.util.Scanner;
//Muhhamad Wildan Nugroho IF09O 21102022
public class Percabangan {
    public  static  void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Sebuah Bilangan : ");
            int bilangan = scanner.nextInt();

            if(bilangan > 0){
                System.out.print("Bilangan Positif");
            } else if (bilangan < 0) {
                System.out.print("Bilangan Negatif");
            }else {
                System.out.print("Bilangan Nol");
            }
        }
    }
}