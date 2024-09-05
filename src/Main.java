import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingresa un número del 1-12, o 13 para cerrar el programa:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opción 1.");
                    break;
                case 2:
                    System.out.println("Seleccionaste la opción 2.");
                    break;
                case 3:
                    System.out.println("Seleccionaste la opción 3.");
                    break;
                case 4:
                    System.out.println("Seleccionaste la opción 4.");
                    break;
                case 5:
                    System.out.println("Seleccionaste la opción 5.");
                    break;
                case 6:
                    System.out.println("Seleccionaste la opción 6.");
                    break;
                case 7:
                    System.out.println("Seleccionaste la opción 7.");
                    break;
                case 8:
                    System.out.println("Seleccionaste la opción 8.");
                    break;
                case 9:
                    System.out.println("Seleccionaste la opción 9.");
                    break;
                case 10:
                    System.out.println("Seleccionaste la opción 10.");
                    break;
                case 11:
                    System.out.println("Seleccionaste la opción 11.");
                    break;
                case 12:
                    System.out.println("Seleccionaste la opción 12.");
                    break;
                case 13:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Número inválido. Por favor, ingresa un número entre 1 y 13.");
                    break;
            }
        } while (opcion != 13);
    }
}