import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos a la máquina de bebidas");
        System.out.println("Elegí una opción de las siguientes:");
        System.out.println("1 - Café");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Agua");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La bebida seleccionada es Café");
                break;
            case 2:
                System.out.println("La bebida seleccionada es Mate");
                break;
            case 3:
                System.out.println("La bebida seleccionada es Gaseosa");
                break;
            case 4:
                System.out.println("La bebida seleccionada es Agua");
                break;

            default:
                System.out.println("Opción Inválida, fin del programa");
                break;
        }
        if (opcion <= 4) {

            System.out.println("Disfrute de su bebida");
        }
        sc.close();

    }
}
