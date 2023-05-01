package Guided;
//Muhhamad Wildan Nugroho 21102022 IF09O
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.nip = 21102022;
        manager.nama = "Wildan";

        manager.showInfo();
        manager.bonus(30000);
    }


}