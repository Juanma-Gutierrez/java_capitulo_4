import java.util.Scanner;

/**
 * Exercise: 17
 *
 * @version: 16/10/2022 09:03
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();
        System.out.print("El último dígito del número introducido es " + num % 10);
        sc.close();
    }
}
