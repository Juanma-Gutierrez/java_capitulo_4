import java.util.Scanner;

/**
 * Exercise: 7
 *
 * @version: 12/10/2022 14:16
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float res;
        System.out.print("Introduce la primera nota: ");
        num1 = sc.nextFloat();
        System.out.print("Introduce la segunda nota: ");
        num2 = sc.nextFloat();
        System.out.print("Introduce la tercera nota: ");
        num3 = sc.nextFloat();
        res = (num1 + num2 + num3) / 3;
        System.out.println(
                "La nota media de " + num1 + ", " + num2 + " y " + num3 + " es: "
                        + String.format("%.2f", res));
        sc.close();
    }
}