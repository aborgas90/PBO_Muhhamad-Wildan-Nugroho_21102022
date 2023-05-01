import java.util.Scanner;
//Muhhamad Wildan Nugroho IF09O 21102022
public class UG_2 {
    public static void main(String[] args) {

        try (Scanner Input = new Scanner(System.in)) {
            String Jurusan[] = {"Teknik Informatika","Teknik Informasi","Rekayasa Perangkat Lunak"};
            System.out.println("Program Form Pendafataran Mahasiswa Baru");

            System.out.print("Masukkan Nama : ");
            String Nama = Input.nextLine();
            System.out.print("Masukkan Umur : ");
            Integer Umur =  Input.nextInt();
            if(Umur > 16){
                System.out.println("Pilih Jurusan:  ");
                for(int i=0; i<Jurusan.length; i++){
                    System.out.println(i + 1 + ". " + Jurusan[i]);
                }
                System.out.print("Masukkan Pilihan :  ");
                Integer Pilihan = Input.nextInt();

                switch(Pilihan)
                {
                    case 1:
                        Data(Nama,Umur);
                        System.out.println("Jurusan :" + Jurusan[0]);
                        break;
                    case 2:
                        Data(Nama,Umur);
                        System.out.println("Jurusan :" + Jurusan[1]);
                        break;
                    case 3:
                        Data(Nama,Umur);
                        System.out.println("Jurusan :" + Jurusan[2]);
                        break;
                     default:
                        System.out.println("Pilihan tidak tersedia !");
                }
            }else{
                System.out.println("Umur Anda Belum cukup");
            }
        }
    }

    public static void Data(String Nama,Integer Umur){
        System.out.println("==Data Pendaftaran==");
        System.out.println("Nama: " + Nama);
        System.out.println("Umur: " + Umur);
    }
}
