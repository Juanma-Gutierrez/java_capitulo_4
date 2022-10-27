import java.util.Scanner;

/**
 * Exercise: 13
 *
 * @version: 13/10/2022 14:18
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        num3 = sc.nextInt();
        while ((num1 > num2) || (num2 > num3)) {
            int temp;
            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }
        }
        System.out.print("Los números ordenados quedan así: " + num1 + ", " + num2 + ", " + num3);
        sc.close();
    }
}
