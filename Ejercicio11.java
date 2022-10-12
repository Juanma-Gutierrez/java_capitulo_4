import java.util.Scanner;

/**
 * Exercise: 11
 *
 * @version: 12/10/2022 19:43
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour;
        int min;
        int seg;
        System.out.print("Introduce la hora: ");
        hour = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        min = sc.nextInt();
        hour = 24 - hour;
        min = (hour * 60) - min;
        seg = min * 60;
        System.out.print("Segundos hasta medianoche: " + seg);
        sc.close();
    }
}
