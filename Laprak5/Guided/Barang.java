package Laprak5.Guided;

public class Barang {
    //Atribute
    int harga;
    String nama;

    //Constructor
    public Barang(){}

    public Barang(String nama,int harga) {
        this.harga = harga;
        this.nama = nama;
    }

    //Method
    public void ShowInfo(){
        System.out.println("Nama Barang: " + this.nama);
        System.out.println("Harga Barang" + this.harga);
        System.out.println();

    }

    
}

