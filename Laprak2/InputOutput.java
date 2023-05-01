import java.util.Scanner;
//Muhhamad Wildan Nugroho IF09O 21102022
public class InputOutput {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukan Nama Anda : "); //untuk tidak menambahkan enter
            String nama = scanner.nextLine();
            System.out.println("Selamat Pagi " + nama );
        }
    }
}
