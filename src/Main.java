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

        int resultado = numeroRandom();
        if (resultado != -1) {
            System.out.println("Enhorabuena! " + resultado + " era el número correcto.");
        } else {
            System.out.println("Máximo de 3 intentos alcanzado.");
        }

    }

    /*public static boolean esFechaValida(int dia, int mes, int ano) {
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
    }*/

    /*public static boolean esPrimo(int num) {
        for (int i = 2; i <= num; i++) {
            return num % i != 0;
        }
        return false;
    }*/

    public static int numeroRandom() {
        Scanner sc = new Scanner(System.in);

        int random = (int) (Math.random() * (108 - 56 + 1)) + 56;
        int numUser;
        int resultado;
        int numX;
        int intentos = 0;
        boolean acierto = false;

        do {
            System.out.println("Ingrese un numero impar mayor que 50: ");
            numUser = sc.nextInt();
        } while (numUser <= 50 || numUser % 2 == 0);

        resultado = numUser * random;

        while (intentos < 3 && !acierto) {
            System.out.println(numUser + " * ( X ) = " + resultado);
            System.out.print("Adivina el número (X): ");
            numX = sc.nextInt();
            intentos++;

            if (numX == random) {
                acierto = true;
            } else if (intentos < 3) {
                System.out.println("Incorrecto. Intenta de nuevo.");
            }
        }

        sc.close();
        return acierto ? random : -1;
    }
}