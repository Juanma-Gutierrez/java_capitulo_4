import java.util.Scanner;

/**
 * Exercise: 25
 *
 * @version: 16/10/2022 13:47
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        int width;
        float costEmblem;
        String emblem;
        costEmblem = 0;
        System.out.print("Introduzca la altura de la bandera en cm: ");
        height = sc.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        width = sc.nextInt();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        emblem = sc.next();
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("%-10s %5d %-8s %7.2f\n", "Bandera de", (height * width), "cm²:",
                (float) (height * width / 100));
        if (emblem.equals("s")) {
            costEmblem = (float) 2.50;
            System.out.printf("%-25s %7.2f\n", "Con escudo:", costEmblem);
        } else {
            costEmblem = 0;
            System.out.printf("%-25s %7.2f\n", "Sin escudo:", costEmblem);
        }
        System.out.printf("%-25s %7.2f\n", "Gastos de envío:", 3.25);
        System.out.printf("%-25s %7.2f\n", "Total:", ((height * width / 100) + costEmblem + 3.25));

        sc.close();
    }

}
