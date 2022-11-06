import java.util.Scanner;

/**
 * Exercise: 2
 *
 * @version: 12/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
 * de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se tienen en cuenta
 * las horas, los minutos no se deben introducir por teclado.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        // Var declarations
        int hour;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la hora (0-23): ");
        hour = sc.nextInt();

        // Process
        if (hour < 0 || hour > 23)
            System.out.print("Has introducido una hora no válida");
        else if (hour >= 21 || hour <= 5)
            System.out.print("Buenas noches");
        else if (hour >= 13)
            System.out.print("Buenas tardes");
        else if (hour >= 6)
            System.out.print("Buenos días");

        // Close scanner
        sc.close();
    }
}
