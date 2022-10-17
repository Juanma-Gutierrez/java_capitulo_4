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
        float raiz;
        raiz = (b * b - (4 * a * c));
        if (raiz >= 0 && 2 * a != 0) {
            res = (float) ((-b + (float) Math.sqrt(raiz)) / (2 * a));
            System.out.printf("x1 = %.2f\n", res);
            res = (float) ((-b - (float) Math.sqrt(raiz)) / (2 * a));
            System.out.printf("x2 = %.2f\n", res);
        } else {
            System.out.print("La ecuación no tiene solución real");
        }
        sc.close();
    }
}
