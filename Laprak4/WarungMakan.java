//Muhhamad Wildan Nugroho 21102022 IF09O
public class WarungMakan {
    String noTelp;
    String namaWarung;
    String Alamat;

    // Construct
    public WarungMakan(String noTelp, String namaWarung, String alamat) {
        this.noTelp = noTelp;
        this.namaWarung = namaWarung;
        Alamat = alamat;
    }

    // Method
    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getNamaWarung() {
        return namaWarung;
    }

    public void setNamaWarung(String namaWarung) {
        this.namaWarung = namaWarung;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public void cekStok(int stock,int input) {
        int result = 0;
        if (stock > input){
            result = stock - input;
            System.out.println("Stock Sisa : " + result);
        }else if(stock == input){
            System.out.println("Stock Habis!");
        }else{
             System.out.println("Stock Tidak Mencukupi");
        }
    }

    public void showInfo() {
        System.out.println("<<WARUNG MAKAN PINGGIR TOL>>");
        System.out.println("Nama Warung: " + namaWarung);
        System.out.println("Alamat: " + Alamat);
        System.out.println("No Telp: " + noTelp);
        System.out.println();
    }
}
