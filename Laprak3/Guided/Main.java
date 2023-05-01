public class Main {
    public static void main(String[] args) {
        //Pembuatan class
        SepedaMotor suzuki = new SepedaMotor("Suzuki","GSX 150R",20000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha","YZF R15",25000000);
        SepedaMotor honda = new SepedaMotor("Honda","CBR 150R",23500000);

        //Menjalankan Method ShowInfo
        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();

        //Uji Coba getter & setter
        SepedaMotor vespa = new SepedaMotor("Vespa","Vespa Matic",4500000);
        //Lihat sebelum perubahan
        System.out.println("Motor Merek :" +vespa.getMerk() + "Dengan tipe(befor) : " + vespa.getTipe());
        vespa.setTipe("Sprint");
        //Lihat hasil perubahan

        System.out.println("Motor Merek :" + vespa.getMerk() + "Dengan tipe (after) :" +vespa.getTipe());
    }
}
