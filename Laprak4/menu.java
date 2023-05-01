//Muhhamad Wildan Nugroho 21102022 IF09O
public class menu extends WarungMakan {
    int stock;
    int harga;
    String NamaMakanan;
    int NoMakanan;

    // Constructor
    public menu(String noTelp, String namaWarung, String alamat, int stock, int harga, String namaMakanan,int noMakanan) {
        super(noTelp, namaWarung, alamat);
        this.stock = stock;
        this.harga = harga;
        NamaMakanan = namaMakanan;
        NoMakanan = noMakanan;
    }

    // Methode
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNamaMakanan() {
        return NamaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        NamaMakanan = namaMakanan;
    }

    public int getNoMakanan() {
        return NoMakanan;
    }

    public void setNoMakanan(int noMakanan) {
        NoMakanan = noMakanan;
    }

    public void showMenu() {
        System.out.println("No Makanan : " + NoMakanan);
        System.out.println("Nama Makanan : " + NamaMakanan);
        System.out.println("Harga Makanan : " + harga);
        System.out.println("Stokan Makanan : " + stock);
        System.out.println();
    }

    public Integer TotalHarga(int jumlahMakanan){
        int result = 0;
        result = getHarga()  * jumlahMakanan;
        return result;
    }

    public void Nota(int jumlahMakanan){
        System.out.println("===============================");
        System.out.println("<<NOTA PEMBELIAN MAKANAN>>");
        System.out.println("===============================");
        System.out.println("Nama Makanan :" + NamaMakanan);
        System.out.println("Harga :" + harga);
        System.out.println("Jumlah :" + jumlahMakanan);
        System.out.println("Total Harga :" + TotalHarga(jumlahMakanan));
        System.out.println("===============================");
    }
}
