import java.util.Scanner;

/**
 * Exercise: 25
 *
 * @version: 16/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
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
                ((float) height * (float) width / 100));
        if (emblem.equals("s")) {
            costEmblem = (float) 2.50;
            System.out.printf("%-25s %7.2f\n", "Con escudo:", costEmblem);
        } else {
            costEmblem = 0;
            System.out.printf("%-25s %7.2f\n", "Sin escudo:", costEmblem);
        }
        System.out.printf("%-25s %7.2f\n", "Gastos de envío:", 3.25);
        System.out.printf("%-25s %7.2f\n", "Total:", (((float) height * (float) width / 100) + costEmblem + 3.25));

        sc.close();
    }

}
