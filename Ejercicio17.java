import java.util.Scanner;

/**
 * Exercise: 17
 *
 * @version: 16/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        // Var declarations
        int num;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();

        // Output results
        if (num >= 0)
            System.out.print("El último dígito de " + num + " es " + num % 10);
        else
            System.out.print("El último dígito de " + num + " es " + num % 10 * -1 + " y es negativo");

        // Close scanner
        sc.close();
    }
}
