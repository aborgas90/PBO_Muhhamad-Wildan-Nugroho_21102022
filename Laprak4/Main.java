import java.util.Scanner;
//Muhhamad Wildan Nugroho 21102022 IF09O
public class Main {
    public static void main(String[] args) {
        WarungMakan KFC = new WarungMakan("0812428164912", "Warung Nasi Goreng", "JL.Raya");
        KFC.showInfo();

        menu pert = new menu("0812428164912", "Warung Nasi Goreng", "JL.Raya", 10, 10000, "Nasi Goreng", 1);
        menu ked = new menu("0812428164912", "Warung Nasi Goreng", "JL.Raya", 4, 15000, "Nasi Goreng Spesial", 2);
        menu ket = new menu("0812428164912", "Warung Nasi Goreng", "JL.Raya", 20, 20000, "Nasi Goreng Spesial + Telur", 3);

        pert.showMenu();
        ked.showMenu();
        ket.showMenu();

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nomor Makanan : ");
            int NoMakanan = input.nextInt();
            System.out.print("Masukkan Jumlah makanan : ");
            int JumMakanan = input.nextInt();
            if(JumMakanan > 0){
                switch(NoMakanan){
                    case 1:
                        if(JumMakanan <= pert.getStock()) {
                            pert.Nota(JumMakanan);
                            pert.cekStok(pert.getStock(), JumMakanan);
                        } else {
                            System.out.println("Maaf, stok tidak mencukupi!");
                        }
                        break;
                    case 2:
                        if(JumMakanan <= ked.getStock()) {
                            ked.Nota(JumMakanan);
                            ked.cekStok(ked.getStock(), JumMakanan);
                        } else {
                            System.out.println("Maaf, stok tidak mencukupi!");
                        }
                        break;
                    case 3:
                        if(JumMakanan <= ket.getStock()) {
                            ket.Nota(JumMakanan);
                            ket.cekStok(ket.getStock(), JumMakanan);
                        } else {
                            System.out.println("Maaf, stok tidak mencukupi!");
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }else{
                System.out.println("Jumlah Makanan tidak boleh 0 !");
            }
        }
    }
}

