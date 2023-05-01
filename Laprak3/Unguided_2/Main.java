import java.util.Scanner;

public class Main {
    public static Readable java;

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("\t\t    LIST BUKU");
        System.out.println("==================================================");
        Buku PBO = new Buku(1,"Pemrograman Berbasis Objek dengan Java","Indrajani",2007,70000);
        Buku DPJ = new Buku(2, "Dasar Pemrograman", "Abdul Kadir", 2004, 30000);

        PBO.showData();
        DPJ.showData();
        System.out.println("==================================================");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan no Buku yang ingin dibeli     : ");
            int Options = input.nextInt();
            System.out.print("Masukkan jumlah Buku yang ingin dibeli : ");
            int JumBuk = input.nextInt();
            System.out.print("Masukkan Jumlah Uang : ");
            int Money = input.nextInt();

            if(Options == 1){
                System.out.println("==================================================");
                System.out.println("\tRINCIAN PEMBELIAN BUKU");
                System.out.println("==================================================");
                PBO.showData();
                System.out.println("==================================================");
                System.out.println("Total Harga :" + PBO.BeliBuku(JumBuk));
                System.out.println("Uang Kembalian :" + PBO.Money(Money,JumBuk));
            }else if (Options == 2) {
                System.out.println("==================================================");
                System.out.println("\tRINCIAN PEMBELIAN BUKU");
                System.out.println("==================================================");
                PBO.showData();
                System.out.println("==================================================");
                System.out.println("Total Harga :" + DPJ.BeliBuku(JumBuk));
                System.out.println("Uang Kembalian :" + DPJ.Money(Money,JumBuk));
            } else {
                System.out.println("Tidak Nomor Buku Tidak Tersedia");
            }
        }
    }
}