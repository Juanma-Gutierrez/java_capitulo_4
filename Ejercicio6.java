import java.util.Scanner;

/**
 * Exercise: 6
 *
 * @version: 12/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // Var declarations
        float h;
        float res;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la altura: ");
        h = sc.nextInt();

        // Process
        if (h >= 0) {
            res = (float) Math.sqrt(2 * h / 9.81);
            System.out.print("El tiempo en caer desde una altura " + h + " es de "
                    + String.format("%.2f", res));
        } else
            System.out.print("No es posible indicar una altura negativa");

        // Scanner close
        sc.close();
    }
}
