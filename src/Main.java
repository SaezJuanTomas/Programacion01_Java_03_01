import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
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
                    int[] arreglo2 = new int[5];

                    System.out.println("Introduce 5 números:");
                    for (int i = 0; i < arreglo2.length; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        arreglo2[i] = scanner.nextInt();
                    }
                    System.out.println("Los números introducidos son:");
                    for (int i = 0; i < arreglo2.length; i++) {
                        System.out.println("Número " + (i + 1) + ": " + arreglo2[i]);
                    }
                case 3:
                    System.out.println("Seleccionaste la opción 3.");
                    System.out.println("Ingrese el tamaño del array:");
                    int tamaño = scanner.nextInt();
                    int[] arreglo3 = new int[tamaño];
                    System.out.println("Ingrese el valor de multiplicación:");
                    int mult = scanner.nextInt();
                    for (int i = 0; i < arreglo3.length; i++) {
                        arreglo3[i] = (i + 1) * mult;
                    }
                    for (int i = 0; i < arreglo3.length; i++) {
                        System.out.println("Número " + (i + 1) + ": " + arreglo3[i]);
                    }
                    break;
                case 4:
                    System.out.println("Seleccionaste la opción 4.");
                    int[] arreglo4 = new int[20];
                    for (int i = 0; i < 19; i++) {
                        System.out.println("Ingrese el numero " + (i + 1));
                        arreglo4[i] = scanner.nextInt();
                    }
                    int mayor = arreglo4[0];
                    int menor = arreglo4[0];
                    for (int i = 1; i < 19; i++) {
                        if (arreglo4[i] > mayor) {
                            mayor = arreglo4[i];
                        }
                        if (arreglo4[i] < menor) {
                            menor = arreglo4[i];
                        }
                    }
                    int rango = mayor - menor;
                    System.out.println("El mayor número es: " + mayor);
                    System.out.println("El menor número es: " + menor);
                    System.out.println("El rango es: " + rango);
                    break;
                case 5:
                    System.out.println("Seleccionaste la opción 5.");
                    break;
                case 6:
                    System.out.println("Seleccionaste la opción 6.");
                    Random random = new Random();
                    int[] arreglo6 = new int[50];
                    for (int i = 0; i < arreglo6.length; i++) {
                        arreglo6[i] = random.nextInt();
                    }
                    System.out.println("Que valor quiere buscar del arreglo?");
                    int num = scanner.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < arreglo6.length; i++) {
                        if (arreglo6[i] == num) {
                            System.out.println("El valor se encuentra en la posición: " + arreglo6[i]);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("El valor no existe");
                    }
                    break;
                case 7:
                    System.out.println("Seleccionaste la opción 7.");
                    int[] arreglo7 = new int[20];
                    int cantPar = 0;
                    int cantImpar = 0;

                    System.out.println("Introduce 20 números:");
                    for (int i = 0; i < arreglo7.length; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        arreglo7[i] = scanner.nextInt();
                        if (arreglo7[i] == 0) {
                            break;
                        } else if (arreglo7[i] % 2 == 0) {
                            cantPar++;
                        } else {
                            cantImpar++;
                        }
                    }
                    System.out.println("Cantidad de números pares: " + cantPar);
                    System.out.println("Cantidad de números impares: " + cantImpar);
                    break;
                case 8:
                    System.out.println("Seleccionaste la opción 8.");
                    int arreglo8[] = new int[10];
                    System.out.println("Introduce 10 números:");
                    for (int i = 0; i < arreglo8.length; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        arreglo8[i] = scanner.nextInt();
                    }
                    Integer[] arregloAscendente = new Integer[arreglo8.length];
                    Integer[] arregloDescendente = new Integer[arreglo8.length];
                    for (int i = 0; i < arreglo8.length; i++) {
                        arregloAscendente[i] = arreglo8[i];
                        arregloDescendente[i] = arreglo8[i];
                    }

                    Arrays.sort(arregloAscendente);
                    Arrays.sort(arregloDescendente, Collections.reverseOrder());

                    System.out.println("Arreglo en orden ascendente:");
                    System.out.println(Arrays.toString(arregloAscendente));

                    System.out.println("Arreglo en orden descendente:");
                    System.out.println(Arrays.toString(arregloDescendente));
                    break;
                case 9:
                    System.out.println("Seleccionaste la opción 9.");
                    System.out.println("Introduce una cadena de números separados por guiones medios (por ejemplo, 45-9-8-6-45-23-21-74-96-32-45-25):");
                    String cadena = scanner.nextLine();

                    String[] arreglo9 = cadena.split("-");

                    int suma = 0;
                    int cantidad = arreglo9.length;

                    for (String numeroCadena : arreglo9) {
                        try {
                            int numero = Integer.parseInt(numeroCadena);
                            suma += numero;
                        } catch (NumberFormatException e) {
                            System.out.println("Error al convertir el número: " + numeroCadena);
                        }
                    }

                    double promedio = (double) suma / cantidad;

                    System.out.println("Suma total de los números: " + suma);
                    System.out.println("Promedio de los números: " + promedio);
                    break;
                case 10:
                    System.out.println("Seleccionaste la opción 10.");
                    break;
                case 11:
                    System.out.println("Seleccionaste la opción 11.");
                    break;
                case 12:
                    System.out.println("Seleccionaste la opción 12.");
                    int arreglo12[] = new int[10];
                    System.out.println("Ingrese 10 numeros");
                    for (int i = 0; i < arreglo12.length; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        arreglo12[i] = scanner.nextInt();
                    }
                    System.out.println("Que valor quiere eliminar?");
                    int numEliminar = scanner.nextInt();

                    int cantEliminar = 0;

                    for (int i = 0; i < arreglo12.length; i++) {
                        if (arreglo12[i] == numEliminar) {
                            cantEliminar++;
                        }
                    }
                    int[] arreglo12New;
                    if (cantEliminar == 0) {
                        System.out.println("El valor no existe");
                        break;
                    } else {
                        arreglo12New = new int[arreglo12.length - cantEliminar];
                        int iNew = 0;
                        for (int i = 0; i < arreglo12.length; i++) {
                            if (arreglo12[i] != numEliminar) {
                                arreglo12New[iNew] = arreglo12[i];
                                iNew++;
                            }
                        }
                    }
                    System.out.println("Arreglo después de eliminar el valor:");
                    System.out.println(Arrays.toString(arreglo12New));
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