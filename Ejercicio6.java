import java.util.Scanner;

/**
 * Exercise: 6
 *
 * @version: 12/10/2022 13:52
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h;
        float res;
        System.out.print("Introduce la altura: ");
        h = sc.nextInt();
        res = (float) Math.sqrt(2 * h / 9.81);
        System.out.print("El tiempo en caer desde una altura " + h + " es de "
                + String.format("%.2f", res));
        sc.close();
    }
}
