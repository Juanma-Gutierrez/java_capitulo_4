import java.util.Scanner;

/**
 * Exercise: 19
 *
 * @version: 16/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int cont;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        // Process
        cont = Integer.toString(Math.abs(num)).length();
        System.out
                .print(cont > 5 ? "El número introducido tiene más de 5 dígitos" : num + " tiene " + cont + " dígitos");
        if (num < 0)
            System.out.print(" y es negativo");

        // Close scanner
        sc.close();
    }
}
