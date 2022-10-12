import java.util.Scanner;

/**
 * Exercise: 9
 *
 * @version: 12/10/2022 18:56
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        float res;
        System.out.print("Introduce el valor de a: ");
        a = sc.nextInt();
        System.out.print("Introduce el valor de b: ");
        b = sc.nextInt();
        System.out.print("Introduce el valor de c: ");
        c = sc.nextInt();
        res = (float) ((-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a));
        System.out.println("x1 = " + res);
        res = (float) ((-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a));
        System.out.println("x2 = " + res);
        sc.close();
    }
}
