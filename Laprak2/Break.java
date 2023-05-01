public class Break {
    //Muhhamad Wildan Nugroho IF09O 21102022
    public static void main(String[] args) {
        int p = 0;
        while (p<=100){
            System.out.println("Perulangan ke-" + p);
            if (p == 50){
                System.out.println("Capek bro!");
                break;
            }
            p+=10;
        }
    }
}
