import java.util.Scanner;

/**
 * Exercise: 2
 *
 * @version: 12/10/2022 11:45
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour;
        System.out.print("Introduce la hora (0-23): ");
        hour = sc.nextInt();
        if (hour < 0 || hour > 23)
            System.out.print("Has introducido una hora no válida");
        else if (hour >= 21 || hour <= 5)
            System.out.print("Buenas noches");
        else if (hour >= 13)
            System.out.print("Buenas tardes");
        else if (hour >= 6)
            System.out.print("Buenos días");
        sc.close();
    }
}
