import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int dia, mes, ano;

        do {
            System.out.println("Ingrese el día: ");
            dia = sc.nextInt();
            System.out.println("Ingrese el mes: ");
            mes = sc.nextInt();
            System.out.println("Ingrese el ano");
            ano = sc.nextInt();

            if (esFechaValida(dia, mes, ano)) {
                System.out.println("La fecha " + dia + "/" + mes + "/" + ano + " es correcta.");
            } else {
                System.out.println("La fecha " + dia + "/" + mes + "/" + ano + " no existe. Revisala");
            }
        } while (!esFechaValida(dia, mes, ano));*/

        /*int esPrimo;

        do {
            System.out.println("Ingresa un numero (0 para salir): ");
            esPrimo = sc.nextInt();

            if (esPrimo(esPrimo)) {
                System.out.println(esPrimo + " ES un numero primo.");
            } else {
                System.out.println(esPrimo + " NO es un numero primo.");
            }
        } while (esPrimo != 0);

        System.out.println("Programa finalizado.");*/

        sc.close();
    }

    public static boolean esFechaValida(int dia, int mes, int ano) {
        if (ano >= 1 && mes >= 1 && mes <= 12 && dia >= 1) {
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (dia <= 31) {
                        return true;
                    }
                case 4, 6, 9, 11:
                    if (dia <= 30) {
                        return true;
                    }
                case 2:
                    if (dia <= 28) {
                        return true;
                    }
                default:
                    return false;
            }
        }
        return false;
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i <= num; i++) {
            return num % i != 0;
        }
        return false;
    }

    //escribir int num1; guardar num1;
    //
}