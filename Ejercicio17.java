import java.util.Scanner;

/**
 * Exercise: 17
 *
 * @version: 16/10/2022 09:03
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();
        if (num >= 0)
            System.out.print("El último dígito de " + num + " es " + num % 10);
        else
            System.out.print("El último dígito de " + num + " es " + num % 10 * -1 + " y es negativo");
        sc.close();
    }
}
