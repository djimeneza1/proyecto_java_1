import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int response = 0;

        do {
            System.out.println("Selecciona opcion");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc=new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("movies");
                    break;
                case 2:
                    System.out.println("series");
                    break;
                default:
                    System.out.println("selecciona opcion");
            }


        }while(response != 0);
    }
}
