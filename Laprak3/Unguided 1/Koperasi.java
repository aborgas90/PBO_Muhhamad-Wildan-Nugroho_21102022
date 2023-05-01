public class Koperasi{
    String Nama_Barang;
    int Harga_Barang;
    int Jumlah_Barang;
    int Total_Harga;


    public Koperasi(String Nama_Barang,int Harga_Barang,int Jumlah_Barang,int Total_Barang){
        this.Nama_Barang = Nama_Barang;
        this.Harga_Barang = Harga_Barang;
        this.Jumlah_Barang = Jumlah_Barang;
        this.Total_Harga = Total_Barang;
    }

    //Methode
    public String getNama_Barang(){
        return Nama_Barang;
    }

    public void setNama_Barang(String Nama_Barang){
        this.Nama_Barang =Nama_Barang;
    }

    public Integer getHarga_Barang(){
        return Harga_Barang;
    }

    public void setHarga_Barang(Integer Harga_Barang){
        this.Harga_Barang = Harga_Barang;
    }

    public Integer getJumlah_Barang(){
        return Jumlah_Barang;
    }

    public void setJumlah_Barang(Integer Jumlah_Barang){
        this.Jumlah_Barang = Jumlah_Barang;
    }

    public Integer getTotal_Harga(){
        return Total_Harga;
    }

    public void setTotal_Harga(Integer Total_Harga){
        this.Total_Harga = Total_Harga;
    }

    public void ShowData(){
        System.out.println("Nama Barang :" + Nama_Barang);
        System.out.println("Harga Barang (Satuan)   :" + Harga_Barang);
        System.out.println("Jumlah Barang   :" + Jumlah_Barang);
        System.out.println("Total Harga :" + Total_Harga);
        System.out.println("");
    }
}