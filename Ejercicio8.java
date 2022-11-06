import java.util.Scanner;

/**
 * Exercise: 8
 *
 * @version: 12/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        // Var declarations
        float num1;
        float num2;
        float num3;
        float res;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la primera nota: ");
        num1 = sc.nextFloat();
        System.out.print("Introduce la segunda nota: ");
        num2 = sc.nextFloat();
        System.out.print("Introduce la tercera nota: ");
        num3 = sc.nextFloat();

        // Output results
        res = (num1 + num2 + num3) / 3;
        System.out.print(
                "La nota media de " + num1 + ", " + num2 + " y " + num3 + " es: "
                        + String.format("%.2f", res) + ", es decir: ");
        if (res < 5)
            System.out.println("Insuficiente");
        else if (res < 6)
            System.out.println("Suficiente");
        else if (res < 7)
            System.out.println("Bien");
        else if (res < 9)
            System.out.println("Notable");
        else if (res <= 10)
            System.out.println("Sobresaliente");

        // Scanner close
        sc.close();
    }
}
