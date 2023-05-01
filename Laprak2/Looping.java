public class Looping {
    //Muhhamad Wildan Nugroho IF09O 21102022
    public static void main(String[] args) {
        for (int i = 0; i< 10; i++) {
            System.out.println("Perulangan for ke-"+ i);
        }
        System.out.println("Perulang" +"an For Selesai");

        int j = 0;
        while ( j < 10){
            System.out.println("Perulangan While ke-"+j);
            j++;
        }
        System.out.println("Perulangan While Selesai");

        int k=0;
        do {
            System.out.println("Perulangan Do-While ke-" + k);
            k++;
        }while(k < 10);
        System.out.println("Perulangan Do-While Selesai");

    }
}
