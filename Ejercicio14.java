import java.util.Scanner;

/**
 * Exercise: 14
 *
 * @version: 13/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        // Var declarations
        int num;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        // Process
        if (num % 2 == 0)
            if (num % 5 == 0)
                System.out.print(num + " es par y divisible entre 5");
            else
                System.out.print(num + " es par y NO es divisible entre 5");
        else if (num % 5 == 0)
            System.out.print(num + " es impar y divisible entre 5");
        else
            System.out.print(num + " es impar y NO es divisible entre 5");

        // Close scanner
        sc.close();
    }
}
