public class Main {
    public static void main(String[] args) {
        Koperasi Buku_Tulis = new Koperasi("Buku Tulis", 5000, 10, 50000);
        Koperasi Pensil = new Koperasi("Pensil",3000,20,60000);
        Buku_Tulis.ShowData();
        Pensil.ShowData();

        int Result = Buku_Tulis.getTotal_Harga() + Pensil.getTotal_Harga();
        System.out.println("Total Harga Semua Barang : " + Result);
    }
}