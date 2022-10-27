import java.util.Scanner;

/**
 * Exercise: 5
 *
 * @version: 12/10/2022 13:03
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b
 * = 0).
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        float b;
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        a = sc.nextInt();
        System.out.print("Ahora introduzca el valor de b: ");
        b = sc.nextInt();
        System.out.print(a != 0 ? "x = " + (-b / a) : "Esa ecuación no tiene solución real");
        sc.close();
    }
}
