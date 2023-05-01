public class Buku {
    int noBuku;
    String JudulBuku;
    String Pengarang;
    int TahunTerbit;
    int Harga;

    //constructor
    public Buku(int noBuku, String JudulBuku, String Pengarang,int TahunTerbit ,int Harga) {
        this.noBuku = noBuku;
        this.JudulBuku = JudulBuku;
        this.Pengarang = Pengarang;
        this.TahunTerbit = TahunTerbit;
        this.Harga = Harga;
    }

    public Integer BeliBuku(int Result){
        Result = Harga * Result;
        return Result;
    }

    public Integer Money(int MoneyChanges,int Result){//kembalian
        MoneyChanges = MoneyChanges - BeliBuku(Result);
        return MoneyChanges;
    }

    public int getNoBuku() {
        return noBuku;
    }

    public void setNoBuku(int noBuku) {
        this.noBuku = noBuku;
    }

    public String getJudulBuku() {
        return JudulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        JudulBuku = judulBuku;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String pengarang) {
        Pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return TahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        TahunTerbit = tahunTerbit;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int harga) {
        Harga = harga;
    }

    public void showData(){
        System.out.println("No Buku: " + noBuku);
        System.out.println("Judul Buku: " + JudulBuku);
        System.out.println("Pengarang: " + Pengarang);
        System.out.println("Harga: " + Harga);
        System.out.println("");
    }
}
