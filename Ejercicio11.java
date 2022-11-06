import java.util.Scanner;

/**
 * Exercise: 11
 *
 * @version: 12/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        // Var declarations
        int hour;
        int min;
        int seg;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la hora: ");
        hour = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        min = sc.nextInt();

        // Process
        hour = 24 - hour;
        min = (hour * 60) - min;
        seg = min * 60;
        System.out.print("Segundos hasta medianoche: " + seg);

        // Scanner close
        sc.close();
    }
}
